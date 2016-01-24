package los.reports

import org.springframework.dao.DataIntegrityViolationException

class R305Controller {

    static allowedMethods = [save: "POST", update: "POST", delete: "POST"]

    def index() {
        redirect(action: "list", params: params)
    }

    def list(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        [r305InstanceList: R305.list(params), r305InstanceTotal: R305.count()]
    }

    def create() {
        [r305Instance: new R305(params)]
    }

    def save() {
        def r305Instance = new R305(params)
        if (!r305Instance.save(flush: true)) {
            render(view: "create", model: [r305Instance: r305Instance])
            return
        }

        flash.message = message(code: 'default.created.message', args: [message(code: 'r305.label', default: 'R305'), r305Instance.id])
        redirect(action: "show", id: r305Instance.id)
    }

    def show(Long id) {
        def r305Instance = R305.get(id)
        if (!r305Instance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'r305.label', default: 'R305'), id])
            redirect(action: "list")
            return
        }

        [r305Instance: r305Instance]
    }

    def edit(Long id) {
        def r305Instance = R305.get(id)
        if (!r305Instance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'r305.label', default: 'R305'), id])
            redirect(action: "list")
            return
        }

        [r305Instance: r305Instance]
    }

    def update(Long id, Long version) {
        def r305Instance = R305.get(id)
        if (!r305Instance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'r305.label', default: 'R305'), id])
            redirect(action: "list")
            return
        }

        if (version != null) {
            if (r305Instance.version > version) {
                r305Instance.errors.rejectValue("version", "default.optimistic.locking.failure",
                        [message(code: 'r305.label', default: 'R305')] as Object[],
                        "Another user has updated this R305 while you were editing")
                render(view: "edit", model: [r305Instance: r305Instance])
                return
            }
        }

        r305Instance.properties = params

        if (!r305Instance.save(flush: true)) {
            render(view: "edit", model: [r305Instance: r305Instance])
            return
        }

        flash.message = message(code: 'default.updated.message', args: [message(code: 'r305.label', default: 'R305'), r305Instance.id])
        redirect(action: "show", id: r305Instance.id)
    }

    def delete(Long id) {
        def r305Instance = R305.get(id)
        if (!r305Instance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'r305.label', default: 'R305'), id])
            redirect(action: "list")
            return
        }

        try {
            r305Instance.delete(flush: true)
            flash.message = message(code: 'default.deleted.message', args: [message(code: 'r305.label', default: 'R305'), id])
            redirect(action: "list")
        }
        catch (DataIntegrityViolationException e) {
            flash.message = message(code: 'default.not.deleted.message', args: [message(code: 'r305.label', default: 'R305'), id])
            redirect(action: "show", id: id)
        }
    }
}
