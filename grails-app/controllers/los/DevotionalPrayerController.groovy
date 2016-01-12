package los

import org.springframework.dao.DataIntegrityViolationException

class DevotionalPrayerController {

    static allowedMethods = [save: "POST", update: "POST", delete: "POST"]

    def index() {
        redirect(action: "list", params: params)
    }

    def list(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        [devotionalPrayerInstanceList: DevotionalPrayer.list(params), devotionalPrayerInstanceTotal: DevotionalPrayer.count()]
    }

    def create() {
        [devotionalPrayerInstance: new DevotionalPrayer(params)]
    }

    def save() {
        def devotionalPrayerInstance = new DevotionalPrayer(params)
        devotionalPrayerInstance.status = 'active'
        if (!devotionalPrayerInstance.save(flush: true)) {
            render(view: "create", model: [devotionalPrayerInstance: devotionalPrayerInstance])
            return
        }

        flash.message = message(code: 'default.created.message', args: [message(code: 'devotionalPrayer.label', default: 'DevotionalPrayer'), devotionalPrayerInstance.id])
        redirect(action: "show", id: devotionalPrayerInstance.id)
    }

    def show(Long id) {
        def devotionalPrayerInstance = DevotionalPrayer.get(id)
        if (!devotionalPrayerInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'devotionalPrayer.label', default: 'DevotionalPrayer'), id])
            redirect(action: "list")
            return
        }

        [devotionalPrayerInstance: devotionalPrayerInstance]
    }

    def edit(Long id) {
        def devotionalPrayerInstance = DevotionalPrayer.get(id)
        if (!devotionalPrayerInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'devotionalPrayer.label', default: 'DevotionalPrayer'), id])
            redirect(action: "list")
            return
        }

        [devotionalPrayerInstance: devotionalPrayerInstance]
    }

    def update(Long id, Long version) {
        def devotionalPrayerInstance = DevotionalPrayer.get(id)
        if (!devotionalPrayerInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'devotionalPrayer.label', default: 'DevotionalPrayer'), id])
            redirect(action: "list")
            return
        }

        if (version != null) {
            if (devotionalPrayerInstance.version > version) {
                devotionalPrayerInstance.errors.rejectValue("version", "default.optimistic.locking.failure",
                        [message(code: 'devotionalPrayer.label', default: 'DevotionalPrayer')] as Object[],
                        "Another user has updated this DevotionalPrayer while you were editing")
                render(view: "edit", model: [devotionalPrayerInstance: devotionalPrayerInstance])
                return
            }
        }

        devotionalPrayerInstance.properties = params

        if (!devotionalPrayerInstance.save(flush: true)) {
            render(view: "edit", model: [devotionalPrayerInstance: devotionalPrayerInstance])
            return
        }

        flash.message = message(code: 'default.updated.message', args: [message(code: 'devotionalPrayer.label', default: 'DevotionalPrayer'), devotionalPrayerInstance.id])
        redirect(action: "show", id: devotionalPrayerInstance.id)
    }

    def delete(Long id) {
        def devotionalPrayerInstance = DevotionalPrayer.get(id)
        if (!devotionalPrayerInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'devotionalPrayer.label', default: 'DevotionalPrayer'), id])
            redirect(action: "list")
            return
        }

        try {
            devotionalPrayerInstance.delete(flush: true)
            flash.message = message(code: 'default.deleted.message', args: [message(code: 'devotionalPrayer.label', default: 'DevotionalPrayer'), id])
            redirect(action: "list")
        }
        catch (DataIntegrityViolationException e) {
            flash.message = message(code: 'default.not.deleted.message', args: [message(code: 'devotionalPrayer.label', default: 'DevotionalPrayer'), id])
            redirect(action: "show", id: id)
        }
    }
}
