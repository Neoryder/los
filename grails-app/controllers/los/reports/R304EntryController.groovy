package los.reports

import los.Student
import org.springframework.dao.DataIntegrityViolationException

class R304EntryController {

    static allowedMethods = [save: "POST", update: "POST", delete: "POST"]

    def index() {
        redirect(action: "list", params: params)
    }

    def list(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        [r304EntryInstanceList: R304Entry.list(params), r304EntryInstanceTotal: R304Entry.count()]
    }

    def create() {
        [r304EntryInstance: new R304Entry(params)]
    }

    def save() {
        def r304EntryInstance = new R304Entry(params)
        if (!r304EntryInstance.save(flush: true)) {
            render(view: "create", model: [r304EntryInstance: r304EntryInstance])
            return
        }

        //TODO update student to sinusubok

        Student student = r304EntryInstance.student
        student.type = 'sinusubok'
        student.save()

        flash.message = message(code: 'default.created.message', args: [message(code: 'r304Entry.label', default: 'R304Entry'), r304EntryInstance.id])
//        redirect(action: "show", id: r304EntryInstance.id)
        redirect(action: 'create',params: ['r304.id':r304EntryInstance?.r304?.id])
    }

    def show(Long id) {
        def r304EntryInstance = R304Entry.get(id)
        if (!r304EntryInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'r304Entry.label', default: 'R304Entry'), id])
            redirect(action: "list")
            return
        }

        [r304EntryInstance: r304EntryInstance]
    }

    def edit(Long id) {
        def r304EntryInstance = R304Entry.get(id)
        if (!r304EntryInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'r304Entry.label', default: 'R304Entry'), id])
            redirect(action: "list")
            return
        }

        [r304EntryInstance: r304EntryInstance]
    }

    def update(Long id, Long version) {
        def r304EntryInstance = R304Entry.get(id)
        if (!r304EntryInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'r304Entry.label', default: 'R304Entry'), id])
            redirect(action: "list")
            return
        }

        if (version != null) {
            if (r304EntryInstance.version > version) {
                r304EntryInstance.errors.rejectValue("version", "default.optimistic.locking.failure",
                        [message(code: 'r304Entry.label', default: 'R304Entry')] as Object[],
                        "Another user has updated this R304Entry while you were editing")
                render(view: "edit", model: [r304EntryInstance: r304EntryInstance])
                return
            }
        }

        r304EntryInstance.properties = params

        if (!r304EntryInstance.save(flush: true)) {
            render(view: "edit", model: [r304EntryInstance: r304EntryInstance])
            return
        }

        flash.message = message(code: 'default.updated.message', args: [message(code: 'r304Entry.label', default: 'R304Entry'), r304EntryInstance.id])
        redirect(action: "show", id: r304EntryInstance.id)
    }

    def delete(Long id) {
        def r304EntryInstance = R304Entry.get(id)
        if (!r304EntryInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'r304Entry.label', default: 'R304Entry'), id])
            redirect(action: "list")
            return
        }

        try {
            r304EntryInstance.delete(flush: true)
            flash.message = message(code: 'default.deleted.message', args: [message(code: 'r304Entry.label', default: 'R304Entry'), id])
            redirect(action: "list")
        }
        catch (DataIntegrityViolationException e) {
            flash.message = message(code: 'default.not.deleted.message', args: [message(code: 'r304Entry.label', default: 'R304Entry'), id])
            redirect(action: "show", id: id)
        }
    }
}
