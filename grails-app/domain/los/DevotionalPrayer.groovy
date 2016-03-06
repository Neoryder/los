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

	def messageSource
	
	String toString(){
		return new SimpleDateFormat(messageSource.getMessage(Constants.DATEFORMATI18N, null, null)).format(dateOfAttendance)
	}
}
