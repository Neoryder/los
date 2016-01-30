package los

import los.reports.R303

class LosTagLib {

    static namespace = "los"

    def r303Taglib = { attrs ->

        def r303List = R303.list()
        def finalList = []
        r303List.each {
            finalList << [
                    key: it.id,
                    value: it.lokal.lokal.toString()+' '+it.dateFrom.format("MMM/dd/yyyy")+' '+it.teacher.name.toString()
            ]
        }
        attrs.from = finalList
        attrs.optionKey = 'key'
        attrs.optionValue = 'value'
        attrs.noSelection = ['': 'SELECT R303.']
        out << g.select(attrs)
    }

    def studentTaglib = { attrs ->

        def r303List = R303.list()
        def finalList = []
        r303List.each {
            finalList << [
                    key: it.id,
                    value: it.lokal.lokal.toString()+' '+it.dateFrom.format("MMM/dd/yyyy")+' '+it.teacher.name.toString()
            ]
        }
        attrs.from = finalList
        attrs.optionKey = 'key'
        attrs.optionValue = 'value'
        attrs.noSelection = ['': 'SELECT R303.']
        out << g.select(attrs)
    }

}
