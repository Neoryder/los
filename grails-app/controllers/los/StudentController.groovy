package los
import org.springframework.dao.DataIntegrityViolationException

class StudentController {

    static allowedMethods = [save: "POST", update: "POST", delete: "POST"]

    def index() {
        redirect(action: "lokalList", params: params)
    }

    def lokalList(){
        params.max = 100
        println params
        [lokalInstanceList:Lokal.list(params),lokalInstanceTotal:Lokal.count()]
    }

    def list(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        [studentInstanceList: Student.list(params), studentInstanceTotal: Student.count()]
    }

//    def listByLokal(Integer max, Integer lokalId) {
    def listByLokal() {
        println params
        println "lokalId:"+params.id
        def lokal = Lokal.get(params.id)
//        params.max = Math.min(max ?: 10, 100)
        def studentList = Student.findAllByLokal(lokal)
        [studentInstanceList: studentList, studentInstanceTotal: studentList.size()]
    }

    def create() {
        println params
        [studentInstance: new Student(params)]
    }

    def save() {
        println params
        //todo Transform birthDate to saveable date
        def studentInstance = new Student(params)

        def studentList = Student.findAllByFirstNameAndMiddleNameAndLastName(
                studentInstance.firstName,studentInstance.middleName,studentInstance.lastName
        )
        if (studentList!=null && !studentList.isEmpty()) {
            render(view: "create", model: [studentInstance: studentInstance])
            return
        }

        if (!studentInstance.save(flush: true)) {
            render(view: "create", model: [studentInstance: studentInstance])
            return
        }

        flash.message = message(code: 'default.created.message', args: [message(code: 'student.label', default: 'Student'), studentInstance.id])
        redirect(action: "show", id: studentInstance.id)
    }

    def show(Long id) {
        def studentInstance = Student.get(id)
        if (!studentInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'student.label', default: 'Student'), id])
            redirect(action: "list")
            return
        }

        [studentInstance: studentInstance]
    }

    def edit(Long id) {
        def studentInstance = Student.get(id)
        if (!studentInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'student.label', default: 'Student'), id])
            redirect(action: "list")
            return
        }

        [studentInstance: studentInstance]
    }

    def update(Long id, Long version) {
        def studentInstance = Student.get(id)
        if (!studentInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'student.label', default: 'Student'), id])
            redirect(action: "list")
            return
        }

        if (version != null) {
            if (studentInstance.version > version) {
                studentInstance.errors.rejectValue("version", "default.optimistic.locking.failure",
                          [message(code: 'student.label', default: 'Student')] as Object[],
                          "Another user has updated this Student while you were editing")
                render(view: "edit", model: [studentInstance: studentInstance])
                return
            }
        }

        studentInstance.properties = params

        if (!studentInstance.save(flush: true)) {
            render(view: "edit", model: [studentInstance: studentInstance])
            return
        }

        flash.message = message(code: 'default.updated.message', args: [message(code: 'student.label', default: 'Student'), studentInstance.id])
        redirect(action: "show", id: studentInstance.id)
    }

    def delete(Long id) {
        def studentInstance = Student.get(id)
        if (!studentInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'student.label', default: 'Student'), id])
            redirect(action: "list")
            return
        }

        try {
            studentInstance.delete(flush: true)
            flash.message = message(code: 'default.deleted.message', args: [message(code: 'student.label', default: 'Student'), id])
            redirect(action: "list")
        }
        catch (DataIntegrityViolationException e) {
            flash.message = message(code: 'default.not.deleted.message', args: [message(code: 'student.label', default: 'Student'), id])
            redirect(action: "show", id: id)
        }
    }
}
