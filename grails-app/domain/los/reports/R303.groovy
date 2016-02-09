package los.reports

import los.Lokal
import los.Teacher

class R303 {

    static constraints = {
        dateTo nullable: true, blank: true
    }
    Lokal lokal
    Integer weekNo
//    @BindingFormat("MM/dd/yyyy")
    Date dateFrom // Date Monday
    Date dateTo // Date Sunday of that week
    Teacher teacher

    List entry

    static hasMany = [ entry :R303Entry ]

    String toString(){
        return weekNo+"|"+teacher.name+"|"+lokal.lokal+"|"+dateFrom.format("MM/dd/yyyy")+"-"+dateTo.format("MM/dd/yyyy")
    }
}
