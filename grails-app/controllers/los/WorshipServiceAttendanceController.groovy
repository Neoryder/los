package los

import org.springframework.dao.DataIntegrityViolationException

class WorshipServiceAttendanceController {

    static allowedMethods = [save: "POST", update: "POST", delete: "POST"]

    def index() {
        redirect(action: "list", params: params)
    }

    def list(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        [worshipServiceAttendanceInstanceList: WorshipServiceAttendance.list(params), worshipServiceAttendanceInstanceTotal: WorshipServiceAttendance.count()]
    }

    def create() {
        [worshipServiceAttendanceInstance: new WorshipServiceAttendance(params)]
    }

    def save() {
        def worshipServiceAttendanceInstance = new WorshipServiceAttendance(params)
        worshipServiceAttendanceInstance.status='active'
        if (!worshipServiceAttendanceInstance.save(flush: true)) {
            render(view: "create", model: [worshipServiceAttendanceInstance: worshipServiceAttendanceInstance])
            return
        }

        flash.message = message(code: 'default.created.message', args: [message(code: 'worshipServiceAttendance.label', default: 'WorshipServiceAttendance'), worshipServiceAttendanceInstance.id])
        redirect(action: "show", id: worshipServiceAttendanceInstance.id)
    }

    def show(Long id) {
        def worshipServiceAttendanceInstance = WorshipServiceAttendance.get(id)
        if (!worshipServiceAttendanceInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'worshipServiceAttendance.label', default: 'WorshipServiceAttendance'), id])
            redirect(action: "list")
            return
        }

        [worshipServiceAttendanceInstance: worshipServiceAttendanceInstance]
    }

    def edit(Long id) {
        def worshipServiceAttendanceInstance = WorshipServiceAttendance.get(id)
        if (!worshipServiceAttendanceInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'worshipServiceAttendance.label', default: 'WorshipServiceAttendance'), id])
            redirect(action: "list")
            return
        }

        [worshipServiceAttendanceInstance: worshipServiceAttendanceInstance]
    }

    def update(Long id, Long version) {
        def worshipServiceAttendanceInstance = WorshipServiceAttendance.get(id)
        if (!worshipServiceAttendanceInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'worshipServiceAttendance.label', default: 'WorshipServiceAttendance'), id])
            redirect(action: "list")
            return
        }

        if (version != null) {
            if (worshipServiceAttendanceInstance.version > version) {
                worshipServiceAttendanceInstance.errors.rejectValue("version", "default.optimistic.locking.failure",
                          [message(code: 'worshipServiceAttendance.label', default: 'WorshipServiceAttendance')] as Object[],
                          "Another user has updated this WorshipServiceAttendance while you were editing")
                render(view: "edit", model: [worshipServiceAttendanceInstance: worshipServiceAttendanceInstance])
                return
            }
        }

        worshipServiceAttendanceInstance.properties = params

        if (!worshipServiceAttendanceInstance.save(flush: true)) {
            render(view: "edit", model: [worshipServiceAttendanceInstance: worshipServiceAttendanceInstance])
            return
        }

        flash.message = message(code: 'default.updated.message', args: [message(code: 'worshipServiceAttendance.label', default: 'WorshipServiceAttendance'), worshipServiceAttendanceInstance.id])
        redirect(action: "show", id: worshipServiceAttendanceInstance.id)
    }

    def delete(Long id) {
        def worshipServiceAttendanceInstance = WorshipServiceAttendance.get(id)
        if (!worshipServiceAttendanceInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'worshipServiceAttendance.label', default: 'WorshipServiceAttendance'), id])
            redirect(action: "list")
            return
        }

        try {
            worshipServiceAttendanceInstance.delete(flush: true)
            flash.message = message(code: 'default.deleted.message', args: [message(code: 'worshipServiceAttendance.label', default: 'WorshipServiceAttendance'), id])
            redirect(action: "list")
        }
        catch (DataIntegrityViolationException e) {
            flash.message = message(code: 'default.not.deleted.message', args: [message(code: 'worshipServiceAttendance.label', default: 'WorshipServiceAttendance'), id])
            redirect(action: "show", id: id)
        }
    }
}
