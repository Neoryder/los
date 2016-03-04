package los

import java.text.SimpleDateFormat

class WorshipServiceAttendance {

    static constraints = {
        dateOfAttendance nullable: false
        type nullable: true
        status  nullable: false, inList: ['active','inactive']
        lokal nullable: true
    }

    Date dateOfAttendance
    String type
    String status

    Student student

    Lokal lokal


    static belongsTo = [student:Student]

	String toString(){
		return "[" + new SimpleDateFormat("MM/dd/yyyy").format(dateOfAttendance) + "|" + lokal + "]"
	}

}
