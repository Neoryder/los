package los

class Teacher {

    static constraints = {
        assignedNumber nullable:false, maxSize: 5, minSize: 5,validator: { try{Integer.parseInt(it); return true;}catch (Exception e){ return false}}
//        firstName nullable:false
//        middleName nullable:true
//        lastName nullable:false
        name nullable: false, maxSize: 1500

        type nullable:true, maxSize: 100
        status nullable: false, inList: ['active','inactive']
        lokal nullable:true
    }

    String assignedNumber
//    String firstName
//    String middleName
//    String lastName
    String name

    Lokal lokal

//    static transients = [ 'wholeName' ]

//    public String getWholeName() {
//        return "$assignedNumber - $firstName $middleName $lastName"
//    }
    // Test commit
    String type
    String status = 'active'


    String toString(){
        return assignedNumber+"|"+name
    }

}
