package los

import org.codehaus.groovy.grails.plugins.jasper.JasperExportFormat
import org.codehaus.groovy.grails.plugins.jasper.JasperReportDef

import java.text.SimpleDateFormat

class ReportsController {


    def jasperService
    def screeningService

    def index() {
        println "params.dateProjected:" + params.dateProjected
        if (params.dateProjected) {
            SimpleDateFormat sdfmt1 = new SimpleDateFormat("MM/dd/yyyy");
            if (params.dateFrom?.trim()) {
                Date dateProjected = sdfmt1.parse(params.dateFrom.toString());
                Calendar calendar = Calendar.getInstance()
                calendar.setTime(dateProjected)
                calendar.add(Calendar.DAY_OF_YEAR, 6)
                calendar.set(Calendar.HOUR, 0)
                calendar.set(Calendar.MINUTE, 0)
                calendar.set(Calendar.MILLISECOND, 0)
                render screeningService.finalScreening(calendar.getTime())
            }
        } else {
            render screeningService.finalScreening()
        }
    }

    def reports(){
        []
    }

    def reportsStudentByTeacher(){



        def studentList = Student.findAllByStatus('active')
        def data = []
        studentList.sort{it?.lokal}.each {
            data << [
                    'lokal':it?.lokal?.lokal,
                    'nagdoktrina':it?.teacher?.name,
                    'akay':it?.lastName + (it?.husbandsLastName?" - "+it?.husbandsLastName:"") +", " + it?.firstName + " " + it?.middleName ,
                    'nagakay':it?.nagakay
            ]
        }

        def jrxmlName = "studentByTeacher"
        def reportParam = [:]
//        reportParam['BIR_LOGO'] = servletContext.getRealPath('/reports/images/bir_logo.png')

        def reportDef = new JasperReportDef(
                folder:'reports/',
                name:jrxmlName,
                fileFormat: JasperExportFormat.PDF_FORMAT,
//                reportData: display
                reportData: data
        )
        reportDef.parameters = reportParam

        println reportDef.parameters

        reportDef.contentStream = jasperService.generateReport(reportDef)
        response.contentType = reportDef.fileFormat.mimeTyp
        response.characterEncoding = 'UTF-8'
        response.outputStream << reportDef.contentStream.toByteArray()

    }

    def showR302(Long id){
        def studentInstance = Student.get(id)
        if (!studentInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'student.label', default: 'Student'), id])
            redirect(action: "list")
            return
        }

        [studentInstance: studentInstance]
    }
}
