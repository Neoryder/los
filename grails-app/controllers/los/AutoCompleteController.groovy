package los

import grails.converters.JSON
import los.reports.R303
import los.reports.R305
import los.reports.R309

class AutoCompleteController {

    def autoCompleteStudent() {

        String name_startsWith = params.starts_with?.toUpperCase()
        def resultsList = []
        List<Student> temp = Student.findAll()
        if(name_startsWith){
            temp = Student.findAllByReferenceNumber01Ilike(name_startsWith+"%")
        }



        temp.each{ laman ->
            resultsList << [id: laman.id,
                            firstName: laman.firstName,
                            middleName: laman.middleName,
                            lastName: laman.lastName,
                            husbandsLastName: laman.husbandsLastName,
                            lokal: laman.lokal.lokal,
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

    def autoCompleteR303() {

        println params
        Integer name_startsWith = new Integer(params.starts_with)
        def resultsList = []

        List<R303> temp = R303.findAll()
        if(name_startsWith){

            println("name_startsWith:"+name_startsWith)
            temp = R303.findAllByWeekNo(name_startsWith)
            println temp
        }

        temp.each{ laman ->
            resultsList << [id: laman.id,
                            dateFrom: laman.dateFrom.format("MM/dd/yyyy"),
                            dateTo: laman.dateTo.format("MM/dd/yyyy"),
                            lokal: laman.lokal.lokal,
                            teacher: laman.teacher.name]
        }

        def jsonData = ['success':true, 'results':resultsList, 'total':resultsList.size()]
        render jsonData as JSON
    }
	
    def autoCompleteR305() {
    	
    	println params
    	Integer name_startsWith = new Integer(params.starts_with)
    	def resultsList = []
    			
    			List<R305> temp = R305.findAll()
    			if(name_startsWith){
    				
    				println("name_startsWith:"+name_startsWith)
    				temp = R305.findAllByWeekNo(name_startsWith)
    				println temp
    			}
    	
    	temp.each{ laman ->
    	resultsList << [id: laman.id,
    	                dateFrom: laman.dateFrom.format("MM/dd/yyyy"),
    	                dateTo: laman.dateTo.format("MM/dd/yyyy"),
    	                lokal: laman.lokal.lokal,
    	                teacher: laman.teacher.name]
    	}
    	
    	def jsonData = ['success':true, 'results':resultsList, 'total':resultsList.size()]
    			render jsonData as JSON
    }
	
    def autoCompleteR309() {
    	
    	println params
    	Integer name_startsWith = new Integer(params.starts_with)
    	def resultsList = []
    			
    			List<R309> temp = R309.findAll()
    			if(name_startsWith){
    				
    				println("name_startsWith:"+name_startsWith)
    				temp = R309.findAllByWeekNo(name_startsWith)
    				println temp
    			}
    	
    	temp.each{ laman ->
    	resultsList << [id: laman.id,
    	                dateFrom: laman.dateFrom.format("MM/dd/yyyy"),
    	                dateTo: laman.dateTo.format("MM/dd/yyyy"),
    	                lokal: laman.lokal.lokal,
    	                teacher: laman.teacher.name]
    	}
    	
    	def jsonData = ['success':true, 'results':resultsList, 'total':resultsList.size()]
    			render jsonData as JSON
    }
}
