package los

import org.joda.time.DateTime
import org.joda.time.Weeks

class ScreeningService {

    def preScreening() {
        def forPreScreeningList = []
        def studentLists = Student.findAllByType('doktrina')
        for (Student student  : studentLists) {
            if(
                student.lesson01DateOfAttendance != null &&
                student.lesson02DateOfAttendance != null &&
                student.lesson03DateOfAttendance != null &&
                student.lesson04DateOfAttendance != null &&
                student.lesson05DateOfAttendance != null &&
                student.lesson06DateOfAttendance != null &&
                student.lesson07DateOfAttendance != null &&
                student.lesson08DateOfAttendance != null &&
                student.lesson09DateOfAttendance != null &&
                student.lesson10DateOfAttendance != null &&
                student.lesson11DateOfAttendance != null &&
                student.lesson12DateOfAttendance != null &&
                student.lesson13DateOfAttendance != null &&
                student.lesson14DateOfAttendance != null &&
                student.lesson15DateOfAttendance != null &&
                student.lesson16DateOfAttendance != null &&
                student.lesson17DateOfAttendance != null &&
                student.lesson18DateOfAttendance != null &&
                student.lesson19DateOfAttendance != null &&
                student.lesson20DateOfAttendance != null &&
                student.lesson21DateOfAttendance != null &&
                student.lesson22DateOfAttendance != null &&
                student.lesson23DateOfAttendance != null &&
                student.lesson24DateOfAttendance != null &&
                student.lesson25DateOfAttendance != null
            ){
                forPreScreeningList << student
            }
        }
        return forPreScreeningList
    }

    def finalScreening() {


        def studentLists = Student.findAllByType('sinusubok')
        def forFinalScreeningList = []
        for (Student student  : studentLists) {
            //Check Devotional Prayer
            Integer dpCount = student.devotionalPrayerList.size()
            //Check Worship Service 48 WS
            Integer wsCount = student.worshipServiceAttendanceList.size()
            println "wsCount original:"+wsCount
            Calendar calendar = Calendar.getInstance()
            calendar.set(Calendar.HOUR,0)
            calendar.set(Calendar.MINUTE,0)
            calendar.set(Calendar.SECOND,0)
            calendar.set(Calendar.MILLISECOND,0)
            Date dateNow = calendar.getTime()
            Calendar calendarOrientation = Calendar.getInstance()
            calendarOrientation.setTime(student.startDate)
            calendarOrientation.set(Calendar.HOUR,0)
            calendarOrientation.set(Calendar.MINUTE,0)
            calendarOrientation.set(Calendar.SECOND,0)
            calendarOrientation.set(Calendar.MILLISECOND,0)
            Date dateStart = calendarOrientation.getTime()

            DateTime dateTime1 = new DateTime(dateStart);
            DateTime dateTime2 = new DateTime(dateNow);

            int weeks = Weeks.weeksBetween(dateTime1, dateTime2).getWeeks()
            println "weeks:"+weeks
            Integer perfectCount = weeks * 2
            println "perfectCount:"+perfectCount
            Integer absent = perfectCount - wsCount
            println "absent:"+absent
            wsCount  = perfectCount - (2*absent)
            println "wsCount:"+wsCount


            if( dpCount>=15 && wsCount >= 48 ){
                forFinalScreeningList << student
            }
        }

        return forFinalScreeningList
    }

    def finalScreening(int week, int year) {


        def studentLists = Student.findAllByType('sinusubok')
        def forFinalScreeningList = []
        for (Student student  : studentLists) {
            //Check Devotional Prayer
            Integer dpCount = student.devotionalPrayerList.size()
            //Check Worship Service 48 WS
            Integer wsCount = student.worshipServiceAttendanceList.size()
            println "wsCount original:"+wsCount
            Calendar calendar = Calendar.getInstance()
            calendar.set(Calendar.HOUR,0)
            calendar.set(Calendar.MINUTE,0)
            calendar.set(Calendar.SECOND,0)
            calendar.set(Calendar.MILLISECOND,0)
            Date dateNow = calendar.getTime()
            Calendar calendarOrientation = Calendar.getInstance()
            calendarOrientation.setTime(student.startDate)
            calendarOrientation.set(Calendar.HOUR,0)
            calendarOrientation.set(Calendar.MINUTE,0)
            calendarOrientation.set(Calendar.SECOND,0)
            calendarOrientation.set(Calendar.MILLISECOND,0)
            Date dateStart = calendarOrientation.getTime()

            DateTime dateTime1 = new DateTime(dateStart);
            DateTime dateTime2 = new DateTime(dateNow);

            int weeks = Weeks.weeksBetween(dateTime1, dateTime2).getWeeks()
            println "weeks:"+weeks
            Integer perfectCount = weeks * 2
            println "perfectCount:"+perfectCount
            Integer absent = perfectCount - wsCount
            println "absent:"+absent
            wsCount  = perfectCount - (2*absent)
            println "wsCount:"+wsCount


            if( dpCount>=15 && wsCount >= 48 ){
                forFinalScreeningList << student
            }
        }

        return forFinalScreeningList
    }
}
