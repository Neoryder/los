package los.reports

import org.springframework.dao.DataIntegrityViolationException

class R309EntryController {

    static allowedMethods = [save: "POST", update: "POST", delete: "POST"]

    def index() {
        redirect(action: "list", params: params)
    }

    def list(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        [r309EntryInstanceList: R309Entry.list(params), r309EntryInstanceTotal: R309Entry.count()]
    }

    def create() {
        [r309EntryInstance: new R309Entry(params)]
    }

    def save() {
        def r309EntryInstance = new R309Entry(params)
        if (!r309EntryInstance.save(flush: true)) {
            render(view: "create", model: [r309EntryInstance: r309EntryInstance])
            return
        }

        //TODO Update Worship Service of Student



        flash.message = message(code: 'default.created.message', args: [message(code: 'r309Entry.label', default: 'R309Entry'), r309EntryInstance.id])
//        redirect(action: "show", id: r309EntryInstance.id)
        redirect(action: 'create',params: ['r309.id':r309EntryInstance?.r309?.id])
    }

    def show(Long id) {
        def r309EntryInstance = R309Entry.get(id)
        if (!r309EntryInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'r309Entry.label', default: 'R309Entry'), id])
            redirect(action: "list")
            return
        }

        [r309EntryInstance: r309EntryInstance]
    }

    def edit(Long id) {
        def r309EntryInstance = R309Entry.get(id)
        if (!r309EntryInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'r309Entry.label', default: 'R309Entry'), id])
            redirect(action: "list")
            return
        }

        [r309EntryInstance: r309EntryInstance]
    }

    def update(Long id, Long version) {
        def r309EntryInstance = R309Entry.get(id)
        if (!r309EntryInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'r309Entry.label', default: 'R309Entry'), id])
            redirect(action: "list")
            return
        }

        if (version != null) {
            if (r309EntryInstance.version > version) {
                r309EntryInstance.errors.rejectValue("version", "default.optimistic.locking.failure",
                        [message(code: 'r309Entry.label', default: 'R309Entry')] as Object[],
                        "Another user has updated this R309Entry while you were editing")
                render(view: "edit", model: [r309EntryInstance: r309EntryInstance])
                return
            }
        }

        r309EntryInstance.properties = params

        if (!r309EntryInstance.save(flush: true)) {
            render(view: "edit", model: [r309EntryInstance: r309EntryInstance])
            return
        }

        flash.message = message(code: 'default.updated.message', args: [message(code: 'r309Entry.label', default: 'R309Entry'), r309EntryInstance.id])
        redirect(action: "show", id: r309EntryInstance.id)
    }

    def delete(Long id) {
        def r309EntryInstance = R309Entry.get(id)
        if (!r309EntryInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'r309Entry.label', default: 'R309Entry'), id])
            redirect(action: "list")
            return
        }

        try {
            r309EntryInstance.delete(flush: true)
            flash.message = message(code: 'default.deleted.message', args: [message(code: 'r309Entry.label', default: 'R309Entry'), id])
            redirect(action: "list")
        }
        catch (DataIntegrityViolationException e) {
            flash.message = message(code: 'default.not.deleted.message', args: [message(code: 'r309Entry.label', default: 'R309Entry'), id])
            redirect(action: "show", id: id)
        }
    }
}
