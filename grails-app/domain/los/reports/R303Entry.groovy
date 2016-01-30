package los.reports

import los.Student

class R303Entry {

    Student student
    Integer lessonMon
    Integer lessonTue
    Integer lessonWed
    Integer lessonThu
    Integer lessonFri
    Integer lessonSat
    Integer lessonSun
    R303 r303

    static belongsTo = [r303:R303]


    static constraints = {
        lessonMon max: 30
        lessonTue max: 30
        lessonWed max: 30
        lessonThu max: 30
        lessonFri max: 30
        lessonSat max: 30
        lessonSun max: 30
    }
}
