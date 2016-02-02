package los.reports

import los.Lokal
import los.Teacher

class R309 {

    Lokal lokal
    Integer weekNo
    Date dateFrom
    Date dateTo
    Date date
    Teacher teacher

    List entry

    static hasMany = [ entry :R309Entry ]


    static constraints = {

    }

    String toString(){
        return weekNo+"|"+getDay()+"|"+teacher.name+"|"+lokal.lokal+"|"+dateFrom.format("MM/dd/yyyy")+"-"+dateTo.format("MM/dd/yyyy")
    }

    String getDay(){
        Calendar calendar = Calendar.getInstance()
        calendar.setTime(date)
        println calendar.getTime()
        println Calendar.THURSDAY
        if(calendar.get(Calendar.DAY_OF_WEEK)==Calendar.THURSDAY){
            return 'THURSDAY'
        } else {
            return 'SUNDAY'
        }

    }
}
