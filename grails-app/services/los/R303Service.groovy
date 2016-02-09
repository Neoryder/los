package los

import los.reports.R303Entry

class R303Service {


    def updateR303EntryInstance(R303Entry r303Entry){

        Date dateFrom = r303Entry.r303.dateFrom
        HashMap<Integer,Date> dateHashMap = new HashMap<>()

        if(r303Entry.lessonMon){
            Calendar calendar = Calendar.getInstance()
            calendar.setTime(dateFrom)
            dateHashMap.put(r303Entry.lessonMon,calendar.getTime())
        }
        if(r303Entry.lessonTue){
            Calendar calendar = Calendar.getInstance()
            calendar.setTime(dateFrom)
            calendar.add(Calendar.DAY_OF_WEEK,1)
            println calendar.getTime()
            dateHashMap.put(r303Entry.lessonTue,calendar.getTime())
        }
        if(r303Entry.lessonWed){
            Calendar calendar = Calendar.getInstance()
            calendar.setTime(dateFrom)
            calendar.add(Calendar.DAY_OF_WEEK,2)
            println calendar.getTime()
            dateHashMap.put(r303Entry.lessonWed,calendar.getTime())
        }
        if(r303Entry.lessonThu){
            Calendar calendar = Calendar.getInstance()
            calendar.setTime(dateFrom)
            calendar.add(Calendar.DAY_OF_WEEK,3)
            println calendar.getTime()
            dateHashMap.put(r303Entry.lessonThu,calendar.getTime())
        }
        if(r303Entry.lessonFri){
            Calendar calendar = Calendar.getInstance()
            calendar.setTime(dateFrom)
            calendar.add(Calendar.DAY_OF_WEEK,4)
            println calendar.getTime()
            dateHashMap.put(r303Entry.lessonFri,calendar.getTime())
        }
        if(r303Entry.lessonSat){
            Calendar calendar = Calendar.getInstance()
            calendar.setTime(dateFrom)
            calendar.add(Calendar.DAY_OF_WEEK,5)
            println calendar.getTime()
            dateHashMap.put(r303Entry.lessonSat,calendar.getTime())
        }
        if(r303Entry.lessonSun){
            Calendar calendar = Calendar.getInstance()
            calendar.setTime(dateFrom)
            calendar.add(Calendar.DAY_OF_WEEK,6)
            println calendar.getTime()
            dateHashMap.put(r303Entry.lessonSun,calendar.getTime())
        }

        Student student = r303Entry?.student

        if(dateHashMap.containsKey(new Integer(1))){
            student?.lesson01DateOfAttendance = dateHashMap.get(new Integer(1))
        }

        if(dateHashMap.containsKey(new Integer(2))){
            student?.lesson02DateOfAttendance = dateHashMap.get(new Integer(2))
        }

        if(dateHashMap.containsKey(new Integer(3))){
            student?.lesson03DateOfAttendance = dateHashMap.get(new Integer(3))
        }

        if(dateHashMap.containsKey(new Integer(4))){
            student?.lesson04DateOfAttendance = dateHashMap.get(new Integer(4))
        }

        if(dateHashMap.containsKey(new Integer(5))){
            student?.lesson05DateOfAttendance = dateHashMap.get(new Integer(5))
        }

        if(dateHashMap.containsKey(new Integer(6))){
            student?.lesson06DateOfAttendance = dateHashMap.get(new Integer(6))
        }

        if(dateHashMap.containsKey(new Integer(7))){
            student?.lesson07DateOfAttendance = dateHashMap.get(new Integer(7))
        }

        if(dateHashMap.containsKey(new Integer(8))){
            student?.lesson08DateOfAttendance = dateHashMap.get(new Integer(8))
        }

        if(dateHashMap.containsKey(new Integer(9))){
            student?.lesson09DateOfAttendance = dateHashMap.get(new Integer(9))
        }

        if(dateHashMap.containsKey(new Integer(10))){
            student?.lesson10DateOfAttendance = dateHashMap.get(new Integer(10))
        }

        if(dateHashMap.containsKey(new Integer(11))){
            student?.lesson11DateOfAttendance = dateHashMap.get(new Integer(11))
        }

        if(dateHashMap.containsKey(new Integer(12))){
            student?.lesson12DateOfAttendance = dateHashMap.get(new Integer(12))
        }

        if(dateHashMap.containsKey(new Integer(13))){
            student?.lesson13DateOfAttendance = dateHashMap.get(new Integer(13))
        }

        if(dateHashMap.containsKey(new Integer(14))){
            student?.lesson14DateOfAttendance = dateHashMap.get(new Integer(14))
        }

        if(dateHashMap.containsKey(new Integer(15))){
            student?.lesson15DateOfAttendance = dateHashMap.get(new Integer(15))
        }

        if(dateHashMap.containsKey(new Integer(16))){
            student?.lesson16DateOfAttendance = dateHashMap.get(new Integer(16))
        }

        if(dateHashMap.containsKey(new Integer(17))){
            student?.lesson17DateOfAttendance = dateHashMap.get(new Integer(17))
        }

        if(dateHashMap.containsKey(new Integer(18))){
            student?.lesson18DateOfAttendance = dateHashMap.get(new Integer(18))
        }

        if(dateHashMap.containsKey(new Integer(19))){
            student?.lesson19DateOfAttendance = dateHashMap.get(new Integer(19))
        }

        if(dateHashMap.containsKey(new Integer(20))){
            student?.lesson20DateOfAttendance = dateHashMap.get(new Integer(20))
        }

        if(dateHashMap.containsKey(new Integer(21))){
            student?.lesson21DateOfAttendance = dateHashMap.get(new Integer(21))
        }

        if(dateHashMap.containsKey(new Integer(22))){
            student?.lesson22DateOfAttendance = dateHashMap.get(new Integer(22))
        }

        if(dateHashMap.containsKey(new Integer(23))){
            student?.lesson23DateOfAttendance = dateHashMap.get(new Integer(23))
        }

        if(dateHashMap.containsKey(new Integer(24))){
            student?.lesson24DateOfAttendance = dateHashMap.get(new Integer(24))
        }

        if(dateHashMap.containsKey(new Integer(25))){
            student?.lesson25DateOfAttendance = dateHashMap.get(new Integer(25))
        }

        student.save()

        return r303Entry

    }


}
