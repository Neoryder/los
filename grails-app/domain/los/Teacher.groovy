package los

class Teacher {

    static constraints = {
        assignedNumber nullable:false
        firstName nullable:false
        middleName nullable:false
        lastName nullable:false

        type nullable:true
        status nullable: false, inList: ['active','inactive']
    }

    String assignedNumber
    String firstName
    String middleName
    String lastName

    String type
    String status = 'active'

}
