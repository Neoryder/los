package los

class ReportsController {

    def screeningService

    def index() {
        render screeningService.finalScreening()
    }
}
