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

	def messageSource
	
	String toString(){
		return "(" + new SimpleDateFormat(messageSource.getMessage(Constants.DATEFORMATI18N, null, null)).format(dateOfAttendance) + "[" + lokal + "])"
	}

}
