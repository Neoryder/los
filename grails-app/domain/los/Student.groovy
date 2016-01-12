package los

class Student {

    static constraints = {
        firstName maxSize: 100, nullable: false, blank: false
        middleName maxSize: 100, nullable: false, blank: false
        lastName maxSize: 100, nullable: false, blank: false
        husbandsLastName  nullable: true, blank: true, maxSize: 100
        spouseName nullable: true, blank: true, maxSize: 100

        lokal nullable: false

        birthCertificateRegistrationNumber nullable: true, blank: true
        marriageContractCertificateRegistrationNumber nullable: true, blank: true
        cenomarNumber nullable: true, blank: true
        birthDate nullable: false
        startDate nullable: true
        gender inList: ['lalake','babae']
        studentType inList: ['Handog-nakatala','Handog-di nakatala','Hindi Handog']
        address nullable: false, blank: false, maxSize: 500
        civilStatus nullable: false, blank: false, inList: ['binata-dalaga','balo','divorced-annulled','may-asawa','may-asawa-hiwalay','may-kinakasama']
        nationality nullable: false, blank: false, maxSize: 100
        citizenship nullable: false, blank: false, maxSize: 100
        nagakay nullable: false, blank: false, maxSize: 200
        nagakayAreaGroup nullable: false, blank: false, maxSize: 50
        nagakayFamilyOrganization nullable: false, blank: false, inList: ['buklod','kadiwa','binhi','pnk']
        referenceNumber01 nullable: false, blank: false, unique: ['firstName','middleName','lastName','husbandsLastName']
        referenceNumber02 nullable: true, blank: true
        referenceNumber03 nullable: true, blank: true
        teacher nullable: false, blank: false


        lesson01DateOfAttendance nullable: true
        lesson02DateOfAttendance nullable: true
        lesson03DateOfAttendance nullable: true
        lesson04DateOfAttendance nullable: true
        lesson05DateOfAttendance nullable: true
        lesson06DateOfAttendance nullable: true
        lesson07DateOfAttendance nullable: true
        lesson08DateOfAttendance nullable: true
        lesson09DateOfAttendance nullable: true
        lesson10DateOfAttendance nullable: true
        lesson11DateOfAttendance nullable: true
        lesson12DateOfAttendance nullable: true
        lesson13DateOfAttendance nullable: true
        lesson14DateOfAttendance nullable: true
        lesson15DateOfAttendance nullable: true
        lesson16DateOfAttendance nullable: true
        lesson17DateOfAttendance nullable: true
        lesson18DateOfAttendance nullable: true
        lesson19DateOfAttendance nullable: true
        lesson20DateOfAttendance nullable: true
        lesson21DateOfAttendance nullable: true
        lesson22DateOfAttendance nullable: true
        lesson23DateOfAttendance nullable: true
        lesson24DateOfAttendance nullable: true
        lesson25DateOfAttendance nullable: true
        lesson26DateOfAttendance nullable: true
        lesson27DateOfAttendance nullable: true
        lesson28DateOfAttendance nullable: true


        type nullable: false, inList: ['doktrina','sinusubok']
        status nullable: false, inList: ['active','inactive']
    }

    String firstName
    String middleName
    String lastName
    String husbandsLastName
    String spouseName


//    String lokal
//    String lcode
//    String distrito
//    String dcode

    Lokal lokal

    Date birthDate
    Date startDate
    String address
    String studentType
    String gender

    String birthCertificateRegistrationNumber
    String marriageContractCertificateRegistrationNumber
    String cenomarNumber
    String civilStatus
    String nationality
    String citizenship
    String nagakay
    String nagakayAreaGroup
    String nagakayFamilyOrganization
    String referenceNumber01
    String referenceNumber02
    String referenceNumber03
    Teacher teacher



    Date lesson01DateOfAttendance
    Date lesson02DateOfAttendance
    Date lesson03DateOfAttendance
    Date lesson04DateOfAttendance
    Date lesson05DateOfAttendance
    Date lesson06DateOfAttendance
    Date lesson07DateOfAttendance
    Date lesson08DateOfAttendance
    Date lesson09DateOfAttendance
    Date lesson10DateOfAttendance
    Date lesson11DateOfAttendance
    Date lesson12DateOfAttendance
    Date lesson13DateOfAttendance
    Date lesson14DateOfAttendance
    Date lesson15DateOfAttendance
    Date lesson16DateOfAttendance
    Date lesson17DateOfAttendance
    Date lesson18DateOfAttendance
    Date lesson19DateOfAttendance
    Date lesson20DateOfAttendance
    Date lesson21DateOfAttendance
    Date lesson22DateOfAttendance
    Date lesson23DateOfAttendance
    Date lesson24DateOfAttendance
    Date lesson25DateOfAttendance
    Date lesson26DateOfAttendance
    Date lesson27DateOfAttendance
    Date lesson28DateOfAttendance


    List devotionalPrayerList
    List worshipServiceAttendanceList

    static hasMany = [devotionalPrayerList:DevotionalPrayer,worshipServiceAttendanceList:WorshipServiceAttendance]

    String type = 'doktrina'
    String status = 'active'


    static transients = ['buongPangalan']
    String getBuongPangalan(){
        return lastName+','+firstName+' '+ middleName + (husbandsLastName?"-"+husbandsLastName:'')
    }

}
