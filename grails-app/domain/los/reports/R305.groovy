package los.reports

import los.Lokal
import los.Teacher

class R305 {

    Lokal lokal
    Integer weekNo
    Date dateFrom
    Date dateTo
    Teacher teacher

    List entry

    static hasMany = [ entry :R305Entry ]

    static constraints = {
    }

    String toString(){
        return weekNo+"|"+teacher.name+"|"+lokal.lokal+"|"+dateFrom.format("MM/dd/yyyy")+"-"+dateTo.format("MM/dd/yyyy")
    }
}
