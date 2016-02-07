package los.reports

import org.springframework.dao.DataIntegrityViolationException

import java.text.SimpleDateFormat

class R303Controller {

    static allowedMethods = [save: "POST", update: "POST", delete: "POST"]

    def index() {
        redirect(action: "list", params: params)
    }

    def list(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        [r303InstanceList: R303.list(params), r303InstanceTotal: R303.count()]
    }

    def create() {
        [r303Instance: new R303(params)]
    }

    def save() {
        println "params:"+params
        def r303Instance = new R303(params)
        println params.dateFrom
        SimpleDateFormat sdfmt1 = new SimpleDateFormat("MM/dd/yyyy");
        if (params.dateFrom?.trim()) {
            Date dateFrom = sdfmt1.parse(params.dateFrom.toString());
            r303Instance.dateFrom = dateFrom
            Calendar calendar = Calendar.getInstance()
            calendar.setTime(dateFrom)
            calendar.add(Calendar.DAY_OF_YEAR, 6)
            calendar.set(Calendar.HOUR, 0)
            calendar.set(Calendar.MINUTE, 0)
            calendar.set(Calendar.MILLISECOND, 0)
            r303Instance.dateTo = calendar.getTime()
        }
        println r303Instance.dateTo
        println r303Instance.clearErrors()
        println r303Instance.validate()
        if (!r303Instance.save(flush: true)) {
            r303Instance.errors.allErrors.each {
                println it
            }
            render(view: "create", model: [r303Instance: r303Instance])
            return
        }

        flash.message = message(code: 'default.created.message', args: [message(code: 'r303.label', default: 'R303'), r303Instance.id])
        redirect(action: "show", id: r303Instance.id)
    }

    def show(Long id) {
        def r303Instance = R303.get(id)
        if (!r303Instance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'r303.label', default: 'R303'), id])
            redirect(action: "list")
            return
        }

        [r303Instance: r303Instance]
    }

    def edit(Long id) {
        def r303Instance = R303.get(id)
        if (!r303Instance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'r303.label', default: 'R303'), id])
            redirect(action: "list")
            return
        }

        [r303Instance: r303Instance]
    }

    def update(Long id, Long version) {
        def r303Instance = R303.get(id)
        if (!r303Instance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'r303.label', default: 'R303'), id])
            redirect(action: "list")
            return
        }

        if (version != null) {
            if (r303Instance.version > version) {
                r303Instance.errors.rejectValue("version", "default.optimistic.locking.failure",
                          [message(code: 'r303.label', default: 'R303')] as Object[],
                          "Another user has updated this R303 while you were editing")
                render(view: "edit", model: [r303Instance: r303Instance])
                return
            }
        }

        r303Instance.properties = params

        println params.dateFrom
        SimpleDateFormat sdfmt1 = new SimpleDateFormat("MM/dd/yyyy");
        Date dateFrom = sdfmt1.parse( params.dateFrom.toString() );
        r303Instance.dateFrom =  dateFrom
        Calendar calendar = Calendar.getInstance()
        calendar.setTime(dateFrom)
        calendar.add(Calendar.DAY_OF_YEAR,7)
        calendar.set(Calendar.HOUR,0)
        calendar.set(Calendar.MINUTE,0)
        calendar.set(Calendar.MILLISECOND,0)
        r303Instance.dateTo = calendar.getTime()
        println r303Instance.dateTo
        println r303Instance.clearErrors()
        println r303Instance.validate()

        if (!r303Instance.save(flush: true)) {
            render(view: "edit", model: [r303Instance: r303Instance])
            return
        }

        flash.message = message(code: 'default.updated.message', args: [message(code: 'r303.label', default: 'R303'), r303Instance.id])
        redirect(action: "show", id: r303Instance.id)
    }

    def delete(Long id) {
        def r303Instance = R303.get(id)
        if (!r303Instance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'r303.label', default: 'R303'), id])
            redirect(action: "list")
            return
        }

        try {
            r303Instance.delete(flush: true)
            flash.message = message(code: 'default.deleted.message', args: [message(code: 'r303.label', default: 'R303'), id])
            redirect(action: "list")
        }
        catch (DataIntegrityViolationException e) {
            flash.message = message(code: 'default.not.deleted.message', args: [message(code: 'r303.label', default: 'R303'), id])
            redirect(action: "show", id: id)
        }
    }
}
