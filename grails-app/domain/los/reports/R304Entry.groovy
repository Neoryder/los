package los.reports

import los.Student

class R304Entry {

    Student student

    R304 r304

    static belongsTo = [r304:R304]

    static constraints = {
        student nullable: false
    }
}
