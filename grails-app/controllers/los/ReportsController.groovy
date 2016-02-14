package los

import java.text.SimpleDateFormat

class ReportsController {

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
}
