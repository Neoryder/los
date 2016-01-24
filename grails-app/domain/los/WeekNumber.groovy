package los

class WeekNumber {

    Integer year
    Date dateFrom
    Date dateTo
    Integer week

    static constraints = {
        dateFrom unique: true
        dateTo unique: true
        week unique: ['year','dateFrom','dateTo']
    }
}
