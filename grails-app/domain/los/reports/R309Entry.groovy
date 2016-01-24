package los.reports

import los.Student

class R309Entry {


    Student student

    R309 r309

    static belongsTo = [r309:R309]

    static constraints = {
        student nullable: false
    }
}
