package los.reports

import los.Student
import los.Uri

class R305Entry {

    Student student
    Uri uri

    R305 r305

    static belongsTo = [r305:R305]

    static constraints = {
        student nullable: false
        uri nullable: true
    }
}
