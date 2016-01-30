package los

import grails.converters.JSON

class AutoCompleteController {

    def autoCompleteStudent() {

        def name_startsWith = params.starts_with?.toUpperCase()
        def resultsList = []
        List<Student> temp = Student.findAll()
        if(name_startsWith){
            temp = Student.findAllByReferenceNumber01Ilike(name_startsWith)
        }



        temp.each{ laman ->
            resultsList << [id: laman.id,
                            label: laman.buongPangalan,
                            referenceNumber01: laman.referenceNumber01]
        }

        def jsonData = ['success':true, 'results':resultsList, 'total':resultsList.size()]
        render jsonData as JSON
    }

    def autoCompleteTeacher() {

        println params
        String name_startsWith = params.starts_with?.toUpperCase()
        def resultsList = []

        List<Teacher> temp = Teacher.findAll()
        if(name_startsWith){
            println("name_startsWith:"+name_startsWith)
            temp = Teacher.findAllByAssignedNumberIlike(name_startsWith+"%")
//            temp = Teacher.findAllByAssignedNumberIlike("070%")
            println temp
        }

        temp.each{ laman ->
            resultsList << [id: laman.id,
                            label: laman.name,
                            assignedNumber: laman.assignedNumber]
        }

        def jsonData = ['success':true, 'results':resultsList, 'total':resultsList.size()]
        render jsonData as JSON
    }
}
