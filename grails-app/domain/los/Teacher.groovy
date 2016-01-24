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

    Lokal lokal

    static transients = [ 'wholeName' ]

    public String getWholeName() {
        return "$firstName $middleName $lastName"
    }
    // Test commit
    String type
    String status = 'active'

}
