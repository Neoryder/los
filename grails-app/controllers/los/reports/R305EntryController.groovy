package los.reports

import los.DevotionalPrayer
import los.Student
import org.springframework.dao.DataIntegrityViolationException

class R305EntryController {

    static allowedMethods = [save: "POST", update: "POST", delete: "POST"]

    def index() {
        redirect(action: "list", params: params)
    }

    def list(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        [r305EntryInstanceList: R305Entry.list(params), r305EntryInstanceTotal: R305Entry.count()]
    }

    def create() {
        [r305EntryInstance: new R305Entry(params)]
    }

    def save() {
        def r305EntryInstance = new R305Entry(params)
        if (!r305EntryInstance.save(flush: true)) {
            render(view: "create", model: [r305EntryInstance: r305EntryInstance])
            return
        }

        Student student =  r305EntryInstance.student
        student.devotionalPrayerList.add(new DevotionalPrayer(student:student, dateOfAttendance: r305EntryInstance.r305.dateFrom))
        student.save()
        flash.message = message(code: 'default.created.message', args: [message(code: 'r305Entry.label', default: 'R305Entry'), r305EntryInstance.id])
//        redirect(action: "show", id: r305EntryInstance.id)
        redirect(action: 'create',params: ['r305.id':r305EntryInstance?.r305?.id])
    }

    def show(Long id) {
        def r305EntryInstance = R305Entry.get(id)
        if (!r305EntryInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'r305Entry.label', default: 'R305Entry'), id])
            redirect(action: "list")
            return
        }

        [r305EntryInstance: r305EntryInstance]
    }

    def edit(Long id) {
        def r305EntryInstance = R305Entry.get(id)
        if (!r305EntryInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'r305Entry.label', default: 'R305Entry'), id])
            redirect(action: "list")
            return
        }

        [r305EntryInstance: r305EntryInstance]
    }

    def update(Long id, Long version) {
        def r305EntryInstance = R305Entry.get(id)
        if (!r305EntryInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'r305Entry.label', default: 'R305Entry'), id])
            redirect(action: "list")
            return
        }

        if (version != null) {
            if (r305EntryInstance.version > version) {
                r305EntryInstance.errors.rejectValue("version", "default.optimistic.locking.failure",
                        [message(code: 'r305Entry.label', default: 'R305Entry')] as Object[],
                        "Another user has updated this R305Entry while you were editing")
                render(view: "edit", model: [r305EntryInstance: r305EntryInstance])
                return
            }
        }

        r305EntryInstance.properties = params

        if (!r305EntryInstance.save(flush: true)) {
            render(view: "edit", model: [r305EntryInstance: r305EntryInstance])
            return
        }

        flash.message = message(code: 'default.updated.message', args: [message(code: 'r305Entry.label', default: 'R305Entry'), r305EntryInstance.id])
        redirect(action: "show", id: r305EntryInstance.id)
    }

    def delete(Long id) {
        def r305EntryInstance = R305Entry.get(id)
        if (!r305EntryInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'r305Entry.label', default: 'R305Entry'), id])
            redirect(action: "list")
            return
        }

        try {
            r305EntryInstance.delete(flush: true)
            flash.message = message(code: 'default.deleted.message', args: [message(code: 'r305Entry.label', default: 'R305Entry'), id])
            redirect(action: "list")
        }
        catch (DataIntegrityViolationException e) {
            flash.message = message(code: 'default.not.deleted.message', args: [message(code: 'r305Entry.label', default: 'R305Entry'), id])
            redirect(action: "show", id: id)
        }
    }
}
