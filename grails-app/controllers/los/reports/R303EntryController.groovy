package los.reports

import org.springframework.dao.DataIntegrityViolationException

class R303EntryController {

    def r303Service

    static allowedMethods = [save: "POST", update: "POST", delete: "POST"]

    def index() {
        redirect(action: "list", params: params)
    }

    def list(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        [r303EntryInstanceList: R303Entry.list(params), r303EntryInstanceTotal: R303Entry.count()]
    }

    def create() {
        [r303EntryInstance: new R303Entry(params)]
    }

    def save() {
        def r303EntryInstance = new R303Entry(params)
        if (!r303EntryInstance.save(flush: true)) {
            render(view: "create", model: [r303EntryInstance: r303EntryInstance])
            return
        }

        r303EntryInstance = r303Service.updateR303EntryInstance(r303EntryInstance)

        flash.message = message(code: 'default.created.message', args: [message(code: 'r303Entry.label', default: 'R303Entry'), r303EntryInstance.id])
//        redirect(action: "show", id: r303EntryInstance.id)
        redirect(action: 'create',params: ['r303.id':r303EntryInstance?.r303?.id])
    }

    def show(Long id) {
        def r303EntryInstance = R303Entry.get(id)
        if (!r303EntryInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'r303Entry.label', default: 'R303Entry'), id])
            redirect(action: "list")
            return
        }

        [r303EntryInstance: r303EntryInstance]
    }

    def edit(Long id) {
        def r303EntryInstance = R303Entry.get(id)
        if (!r303EntryInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'r303Entry.label', default: 'R303Entry'), id])
            redirect(action: "list")
            return
        }

        [r303EntryInstance: r303EntryInstance]
    }

    def update(Long id, Long version) {
        def r303EntryInstance = R303Entry.get(id)
        if (!r303EntryInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'r303Entry.label', default: 'R303Entry'), id])
            redirect(action: "list")
            return
        }

        if (version != null) {
            if (r303EntryInstance.version > version) {
                r303EntryInstance.errors.rejectValue("version", "default.optimistic.locking.failure",
                          [message(code: 'r303Entry.label', default: 'R303Entry')] as Object[],
                          "Another user has updated this R303Entry while you were editing")
                render(view: "edit", model: [r303EntryInstance: r303EntryInstance])
                return
            }
        }

        r303EntryInstance.properties = params

        if (!r303EntryInstance.save(flush: true)) {
            render(view: "edit", model: [r303EntryInstance: r303EntryInstance])
            return
        }

        flash.message = message(code: 'default.updated.message', args: [message(code: 'r303Entry.label', default: 'R303Entry'), r303EntryInstance.id])
        redirect(action: "show", id: r303EntryInstance.id)
    }

    def delete(Long id) {
        def r303EntryInstance = R303Entry.get(id)
        if (!r303EntryInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'r303Entry.label', default: 'R303Entry'), id])
            redirect(action: "list")
            return
        }

        try {
            r303EntryInstance.delete(flush: true)
            flash.message = message(code: 'default.deleted.message', args: [message(code: 'r303Entry.label', default: 'R303Entry'), id])
            redirect(action: "list")
        }
        catch (DataIntegrityViolationException e) {
            flash.message = message(code: 'default.not.deleted.message', args: [message(code: 'r303Entry.label', default: 'R303Entry'), id])
            redirect(action: "show", id: id)
        }
    }
}
