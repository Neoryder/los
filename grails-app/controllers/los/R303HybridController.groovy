package los

import los.reports.R303
import los.reports.R303Entry

class R303HybridController {

    def index() {

        def r303Instance = new R303(params)
        if (params.r303Id){
            r303Instance = R303.get(params.r303Id)
        }

        render view: 'entryList', model:[
                r303Instance: r303Instance,
                r303EntryInstance: new R303Entry(params),
                r303EntryInstanceList: R303Entry.list(params), r303EntryInstanceTotal: R303Entry.count()
        ]
    }

    def create(){

        params.max = Math.min(max ?: 10, 100)
        render view: 'entryList', model:[
                r303Instance: new R303(params),
                r303EntryInstance: new R303Entry(params),
                r303EntryInstanceList: R303Entry.list(params), r303EntryInstanceTotal: R303Entry.count()
        ]
    }
}
