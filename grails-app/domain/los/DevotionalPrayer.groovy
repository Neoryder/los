package los

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

}
