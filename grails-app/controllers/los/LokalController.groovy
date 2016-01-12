package los

import org.springframework.dao.DataIntegrityViolationException

class LokalController {

    static allowedMethods = [save: "POST", update: "POST", delete: "POST"]

    def index() {
        redirect(action: "list", params: params)
    }

    def list(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        [lokalInstanceList: Lokal.list(params), lokalInstanceTotal: Lokal.count()]
    }

    def create() {
        [lokalInstance: new Lokal(params)]
    }

    def save() {
        def lokalInstance = new Lokal(params)
        if (!lokalInstance.save(flush: true)) {
            render(view: "create", model: [lokalInstance: lokalInstance])
            return
        }

        flash.message = message(code: 'default.created.message', args: [message(code: 'lokal.label', default: 'Lokal'), lokalInstance.id])
        redirect(action: "show", id: lokalInstance.id)
    }

    def show(Long id) {
        def lokalInstance = Lokal.get(id)
        if (!lokalInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'lokal.label', default: 'Lokal'), id])
            redirect(action: "list")
            return
        }

        [lokalInstance: lokalInstance]
    }

    def edit(Long id) {
        def lokalInstance = Lokal.get(id)
        if (!lokalInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'lokal.label', default: 'Lokal'), id])
            redirect(action: "list")
            return
        }

        [lokalInstance: lokalInstance]
    }

    def update(Long id, Long version) {
        def lokalInstance = Lokal.get(id)
        if (!lokalInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'lokal.label', default: 'Lokal'), id])
            redirect(action: "list")
            return
        }

        if (version != null) {
            if (lokalInstance.version > version) {
                lokalInstance.errors.rejectValue("version", "default.optimistic.locking.failure",
                        [message(code: 'lokal.label', default: 'Lokal')] as Object[],
                        "Another user has updated this Lokal while you were editing")
                render(view: "edit", model: [lokalInstance: lokalInstance])
                return
            }
        }

        lokalInstance.properties = params

        if (!lokalInstance.save(flush: true)) {
            render(view: "edit", model: [lokalInstance: lokalInstance])
            return
        }

        flash.message = message(code: 'default.updated.message', args: [message(code: 'lokal.label', default: 'Lokal'), lokalInstance.id])
        redirect(action: "show", id: lokalInstance.id)
    }

    def delete(Long id) {
        def lokalInstance = Lokal.get(id)
        if (!lokalInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'lokal.label', default: 'Lokal'), id])
            redirect(action: "list")
            return
        }

        try {
            lokalInstance.delete(flush: true)
            flash.message = message(code: 'default.deleted.message', args: [message(code: 'lokal.label', default: 'Lokal'), id])
            redirect(action: "list")
        }
        catch (DataIntegrityViolationException e) {
            flash.message = message(code: 'default.not.deleted.message', args: [message(code: 'lokal.label', default: 'Lokal'), id])
            redirect(action: "show", id: id)
        }
    }
}
