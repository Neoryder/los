package los.reports

import los.Lokal
import los.Teacher

class R303 {

    Lokal lokal
    Integer weekNo
    Date dateFrom // Date Monday
    Date dateTo // Date Sunday of that week
    Teacher teacher

    List entry

    static hasMany = [ entry :R303Entry ]

    static constraints = {
    }
}
