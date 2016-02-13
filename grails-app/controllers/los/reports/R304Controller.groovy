package los.reports

import org.springframework.dao.DataIntegrityViolationException

import java.text.SimpleDateFormat

class R304Controller {

    static allowedMethods = [save: "POST", update: "POST", delete: "POST"]

    def index() {
        redirect(action: "list", params: params)
    }

    def list(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        [r304InstanceList: R304.list(params), r304InstanceTotal: R304.count()]
    }

    def create() {
        [r304Instance: new R304(params)]
    }

    def save() {
        println "params:"+params
        def r304Instance = new R304(params)
        println params.dateFrom
        SimpleDateFormat sdfmt1 = new SimpleDateFormat("MM/dd/yyyy");
        if (params.dateFrom?.trim()) {
            Date dateFrom = sdfmt1.parse(params.dateFrom.toString());
            r304Instance.dateFrom = dateFrom
            Calendar calendar = Calendar.getInstance()
            calendar.setTime(dateFrom)
            calendar.add(Calendar.DAY_OF_YEAR, 6)
            calendar.set(Calendar.HOUR, 0)
            calendar.set(Calendar.MINUTE, 0)
            calendar.set(Calendar.MILLISECOND, 0)
            r304Instance.dateTo = calendar.getTime()
        }
        println r304Instance.dateTo
        println r304Instance.clearErrors()
        println r304Instance.validate()
        if (!r304Instance.save(flush: true)) {
            r304Instance.errors.allErrors.each {
                println it
            }
            render(view: "create", model: [r304Instance: r304Instance])
            return
        }

        flash.message = message(code: 'default.created.message', args: [message(code: 'r304.label', default: 'R304'), r304Instance.id])
        redirect(action: "show", id: r304Instance.id)
    }

    def show(Long id) {
        def r304Instance = R304.get(id)
        if (!r304Instance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'r304.label', default: 'R304'), id])
            redirect(action: "list")
            return
        }

        [r304Instance: r304Instance]
    }

    def edit(Long id) {
        def r304Instance = R304.get(id)
        if (!r304Instance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'r304.label', default: 'R304'), id])
            redirect(action: "list")
            return
        }

        [r304Instance: r304Instance]
    }

    def update(Long id, Long version) {
        def r304Instance = R304.get(id)
        if (!r304Instance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'r304.label', default: 'R304'), id])
            redirect(action: "list")
            return
        }

        if (version != null) {
            if (r304Instance.version > version) {
                r304Instance.errors.rejectValue("version", "default.optimistic.locking.failure",
                        [message(code: 'r304.label', default: 'R304')] as Object[],
                        "Another user has updated this R304 while you were editing")
                render(view: "edit", model: [r304Instance: r304Instance])
                return
            }
        }

        r304Instance.properties = params

        if (!r304Instance.save(flush: true)) {
            render(view: "edit", model: [r304Instance: r304Instance])
            return
        }

        flash.message = message(code: 'default.updated.message', args: [message(code: 'r304.label', default: 'R304'), r304Instance.id])
        redirect(action: "show", id: r304Instance.id)
    }

    def delete(Long id) {
        def r304Instance = R304.get(id)
        if (!r304Instance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'r304.label', default: 'R304'), id])
            redirect(action: "list")
            return
        }

        try {
            r304Instance.delete(flush: true)
            flash.message = message(code: 'default.deleted.message', args: [message(code: 'r304.label', default: 'R304'), id])
            redirect(action: "list")
        }
        catch (DataIntegrityViolationException e) {
            flash.message = message(code: 'default.not.deleted.message', args: [message(code: 'r304.label', default: 'R304'), id])
            redirect(action: "show", id: id)
        }
    }
}
