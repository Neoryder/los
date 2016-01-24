package los.reports

import los.Lokal
import los.Teacher

class R309 {

    Lokal lokal
    Integer weekNo
    Date dateFrom
    Date dateTo
    Teacher teacher

    List entry

    static hasMany = [ entry :R309Entry ]


    static constraints = {
    }
}
