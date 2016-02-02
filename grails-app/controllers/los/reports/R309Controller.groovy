package los.reports

import org.springframework.dao.DataIntegrityViolationException

import java.text.SimpleDateFormat

class R309Controller {

    static allowedMethods = [save: "POST", update: "POST", delete: "POST"]

    def index() {
        redirect(action: "list", params: params)
    }

    def list(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        [r309InstanceList: R309.list(params), r309InstanceTotal: R309.count()]
    }

    def create() {
        [r309Instance: new R309(params)]
    }

    def save() {
        def r309Instance = new R309(params)
        SimpleDateFormat sdfmt1 = new SimpleDateFormat("MM/dd/yyyy");
        Date dateFrom = sdfmt1.parse( params.dateFrom.toString() );
        r309Instance.dateFrom =  dateFrom
        Date date = sdfmt1.parse( params.date.toString() );
        r309Instance.date = date
        Calendar calendar = Calendar.getInstance()
        calendar.setTime(dateFrom)
        calendar.add(Calendar.DAY_OF_YEAR,7)
        calendar.set(Calendar.HOUR,0)
        calendar.set(Calendar.MINUTE,0)
        calendar.set(Calendar.SECOND,0)
        calendar.set(Calendar.MILLISECOND,0)
        r309Instance.dateTo = calendar.getTime()
        println r309Instance.dateTo
        println r309Instance.clearErrors()
        println r309Instance.validate()
        if (!r309Instance.save(flush: true)) {
            render(view: "create", model: [r309Instance: r309Instance])
            return
        }

        flash.message = message(code: 'default.created.message', args: [message(code: 'r309.label', default: 'R309'), r309Instance.id])
        redirect(action: "show", id: r309Instance.id)
    }

    def show(Long id) {
        def r309Instance = R309.get(id)
        if (!r309Instance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'r309.label', default: 'R309'), id])
            redirect(action: "list")
            return
        }

        [r309Instance: r309Instance]
    }

    def edit(Long id) {
        def r309Instance = R309.get(id)
        if (!r309Instance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'r309.label', default: 'R309'), id])
            redirect(action: "list")
            return
        }

        [r309Instance: r309Instance]
    }

    def update(Long id, Long version) {
        def r309Instance = R309.get(id)
        if (!r309Instance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'r309.label', default: 'R309'), id])
            redirect(action: "list")
            return
        }

        if (version != null) {
            if (r309Instance.version > version) {
                r309Instance.errors.rejectValue("version", "default.optimistic.locking.failure",
                        [message(code: 'r309.label', default: 'R309')] as Object[],
                        "Another user has updated this R309 while you were editing")
                render(view: "edit", model: [r309Instance: r309Instance])
                return
            }
        }

        r309Instance.properties = params

        if (!r309Instance.save(flush: true)) {
            render(view: "edit", model: [r309Instance: r309Instance])
            return
        }

        flash.message = message(code: 'default.updated.message', args: [message(code: 'r309.label', default: 'R309'), r309Instance.id])
        redirect(action: "show", id: r309Instance.id)
    }

    def delete(Long id) {
        def r309Instance = R309.get(id)
        if (!r309Instance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'r309.label', default: 'R309'), id])
            redirect(action: "list")
            return
        }

        try {
            r309Instance.delete(flush: true)
            flash.message = message(code: 'default.deleted.message', args: [message(code: 'r309.label', default: 'R309'), id])
            redirect(action: "list")
        }
        catch (DataIntegrityViolationException e) {
            flash.message = message(code: 'default.not.deleted.message', args: [message(code: 'r309.label', default: 'R309'), id])
            redirect(action: "show", id: id)
        }
    }
}
