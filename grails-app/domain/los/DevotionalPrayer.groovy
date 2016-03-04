package los

import java.text.SimpleDateFormat

class DevotionalPrayer {

    static constraints = {
        dateOfAttendance nullable: false
//        type nullable: true
//        status  nullable: false, inList: ['active','inactive']
    }

    Date dateOfAttendance

//    String type
//    String status
    Student student

    static belongsTo = [student:Student]

	String toString(){
		return "[" + new SimpleDateFormat("MM/dd/yyyy").format(dateOfAttendance) + "]"
	}
}
