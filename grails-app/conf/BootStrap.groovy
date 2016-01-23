import los.Distrito
import los.Lokal
import los.Teacher
import los.Uri

class BootStrap {

    def init = { servletContext ->

        Distrito mms = Distrito.findByDistrito('MMS')

        //TODO:Actual DCODE
        if(!Distrito.findByDistrito('MMS')){
            mms = new Distrito(distrito:'MMS', dcode:'01089').save()
        }
        if(!Distrito.findByDistrito('MMN')){
            new Distrito(distrito:'MMN', dcode:'01090').save()
        }
        if(!Distrito.findByDistrito('MME')){
            new Distrito(distrito:'MME', dcode:'01091').save()
        }
        if(!Distrito.findByDistrito('MMW')){
            new Distrito(distrito:'MMW', dcode:'01092').save()
        }
        if(!Distrito.findByDistrito('Central')){
            new Distrito(distrito:'Central', dcode:'01093').save()
        }
        if(!Distrito.findByDistrito('QC')){
            new Distrito(distrito:'QC', dcode:'01094').save()
        }
        //TODO:Actual LCODE
        if(!Lokal.findByLokal('Admiral')){
            new Lokal(distrito:mms, lokal:'Admiral', lcode: '001').save()
        }
        if(!Lokal.findByLokal('Alabang')){
            new Lokal(distrito:mms, lokal:'Alabang', lcode: '002').save()
        }
        if(!Lokal.findByLokal('Almanza')){
            new Lokal(distrito:mms, lokal:'Almanza', lcode: '003').save()
        }
        if(!Lokal.findByLokal('Bagumbayan')){
            new Lokal(distrito:mms, lokal:'Bagumbayan', lcode: '004').save()
        }
        if(!Lokal.findByLokal('Bel-Air')){
            new Lokal(distrito:mms, lokal:'Bel-Air', lcode: '005').save()
        }
        if(!Lokal.findByLokal('Better Living')){
            new Lokal(distrito:mms, lokal:'Better Living', lcode: '006').save()
        }
        if(!Lokal.findByLokal('CAA Ext.')){
            new Lokal(distrito:mms, lokal:'CAA Ext.', lcode: '007').save()
        }
        if(!Lokal.findByLokal('CAA')){
            new Lokal(distrito:mms, lokal:'CAA', lcode: '008').save()
        }
        if(!Lokal.findByLokal('Camp Bagong Diwa Ext')){
            new Lokal(distrito:mms, lokal:'Camp Bagong Diwa Ext', lcode: '009').save()
        }
        if(!Lokal.findByLokal('Camp Sampaguita')){
            new Lokal(distrito:mms, lokal:'Camp Sampaguita', lcode: '010').save()
        }
        if(!Lokal.findByLokal('Central Signal')){
            new Lokal(distrito:mms, lokal:'Central Signal', lcode: '011').save()
        }
        if(!Lokal.findByLokal('Cupang Muntinlupa')){
            new Lokal(distrito:mms, lokal:'Cupang Muntinlupa', lcode: '012').save()
        }
        if(!Lokal.findByLokal('Evangelista')){
            new Lokal(distrito:mms, lokal:'Evangelista', lcode: '013').save()
        }
        if(!Lokal.findByLokal('Golden Acres')){
            new Lokal(distrito:mms, lokal:'Golden Acres', lcode: '014').save()
        }
        if(!Lokal.findByLokal('Guadalupe')){
            new Lokal(distrito:mms, lokal:'Guadalupe', lcode: '015').save()
        }
        if(!Lokal.findByLokal('Hagonoy')){
            new Lokal(distrito:mms, lokal:'Hagonoy', lcode: '016').save()
        }
        if(!Lokal.findByLokal('Ibayo')){
            new Lokal(distrito:mms, lokal:'Ibayo', lcode: '017').save()
        }
        if(!Lokal.findByLokal('Jackson')){
            new Lokal(distrito:mms, lokal:'Jackson', lcode: '018').save()
        }
        if(!Lokal.findByLokal('Karunungan')){
            new Lokal(distrito:mms, lokal:'Karunungan', lcode: '019').save()
        }
        if(!Lokal.findByLokal('Las Piñas')){
            new Lokal(distrito:mms, lokal:'Las Piñas', lcode: '020').save()
        }
        if(!Lokal.findByLokal('Lower Bicutan')){
            new Lokal(distrito:mms, lokal:'Lower Bicutan', lcode: '021').save()
        }
        if(!Lokal.findByLokal('Madrigal')){
            new Lokal(distrito:mms, lokal:'Madrigal', lcode: '022').save()
        }
        if(!Lokal.findByLokal('Makati')){
            new Lokal(distrito:mms, lokal:'Makati', lcode: '023').save()
        }
        if(!Lokal.findByLokal('Makati City Jail Ext')){
            new Lokal(distrito:mms, lokal:'Makati City Jail Ext', lcode: '024').save()
        }
        if(!Lokal.findByLokal('Malibay')){
            new Lokal(distrito:mms, lokal:'Malibay', lcode: '025').save()
        }
        if(!Lokal.findByLokal('Daang Hari - Malipay')){
            new Lokal(distrito:mms, lokal:'Daang Hari - Malipay', lcode: '026').save()
        }
        if(!Lokal.findByLokal('Muntinlupa')){
            new Lokal(distrito:mms, lokal:'Muntinlupa', lcode: '027').save()
        }
        if(!Lokal.findByLokal('Napindan')){
            new Lokal(distrito:mms, lokal:'Napindan', lcode: '028').save()
        }
        if(!Lokal.findByLokal('NBP')){
            new Lokal(distrito:mms, lokal:'NBP', lcode: '029').save()
        }
        if(!Lokal.findByLokal('North Signal')){
            new Lokal(distrito:mms, lokal:'North Signal', lcode: '030').save()
        }
        if(!Lokal.findByLokal('Pamplona')){
            new Lokal(distrito:mms, lokal:'Pamplona', lcode: '031').save()
        }
        if(!Lokal.findByLokal('Parañaque')){
            new Lokal(distrito:mms, lokal:'Parañaque', lcode: '032').save()
        }
        if(!Lokal.findByLokal('Pasay')){
            new Lokal(distrito:mms, lokal:'Pasay', lcode: '033').save()
        }
        if(!Lokal.findByLokal('Pateros')){
            new Lokal(distrito:mms, lokal:'Pateros', lcode: '034').save()
        }
        if(!Lokal.findByLokal('Pembo')){
            new Lokal(distrito:mms, lokal:'Pembo', lcode: '035').save()
        }
        if(!Lokal.findByLokal('Pinagsama')){
            new Lokal(distrito:mms, lokal:'Pinagsama', lcode: '036').save()
        }
        if(!Lokal.findByLokal('Proprietarios')){
            new Lokal(distrito:mms, lokal:'Proprietarios', lcode: '037').save()
        }
        if(!Lokal.findByLokal('Sacramento')){
            new Lokal(distrito:mms, lokal:'Sacramento', lcode: '038').save()
        }
        if(!Lokal.findByLokal('Severina 18')){
            new Lokal(distrito:mms, lokal:'Severina 18', lcode: '039').save()
        }
        if(!Lokal.findByLokal('Saint Joseph')){
            new Lokal(distrito:mms, lokal:'Saint Joseph', lcode: '040').save()
        }
        if(!Lokal.findByLokal('Sucat')){
            new Lokal(distrito:mms, lokal:'Sucat', lcode: '041').save()
        }
        if(!Lokal.findByLokal('Taguig')){
            new Lokal(distrito:mms, lokal:'Taguig', lcode: '042').save()
        }
        if(!Lokal.findByLokal('Talon')){
            new Lokal(distrito:mms, lokal:'Talon', lcode: '043').save()
        }
        if(!Lokal.findByLokal('Tipas')){
            new Lokal(distrito:mms, lokal:'Tipas', lcode: '044').save()
        }
        if(!Lokal.findByLokal('Tunasan')){
            new Lokal(distrito:mms, lokal:'Tunasan', lcode: '045').save()
        }
        if(!Lokal.findByLokal('UP 1')){
            new Lokal(distrito:mms, lokal:'UP 1', lcode: '046').save()
        }
        if(!Lokal.findByLokal('Upper Bicutan')){
            new Lokal(distrito:mms, lokal:'Upper Bicutan', lcode: '047').save()
        }
        if(!Lokal.findByLokal('Ususan')){
            new Lokal(distrito:mms, lokal:'Ususan', lcode: '048').save()
        }
        if(!Lokal.findByLokal('Victoria')){
            new Lokal(distrito:mms, lokal:'Victoria', lcode: '049').save()
        }
        if(!Lokal.findByLokal('Fourth Estate')){
            new Lokal(distrito:mms, lokal:'Fourth Estate', lcode: '050').save()
        }
        if(!Lokal.findByLokal('BF International')){
            new Lokal(distrito:mms, lokal:'BF International', lcode: '051').save()
        }


        Teacher teacher = Teacher.findByAssignedNumber('123456')

        if(!Teacher.findByAssignedNumber('123456')){
            teacher = new Teacher(assignedNumber: '123456',
                    firstName:'Anthony',
                    middleName:'M',
                    lastName:'Umali',
                    type:'pastor'
            ).save()
        }

        //BootStrap Uri
        Uri uriBG = Uri.findByCode('BG')
        if(!uriBG){
             uriBG = new Uri(code: 'BG', description: 'Bagong Itinalang Sinusubok').save()
        }

        Uri uriDT = Uri.findByCode('DT')
        if(!uriDT){
            uriDT = new Uri(code: 'DT', description: 'Dating Sinusubok').save()
        }

        Uri uriTf = Uri.findByCode('TF')
        if(!uriTf){
            uriTf = new Uri(code: 'TF', description: 'Tumigil sa Pagsubok').save()
        }

        Uri uriBL = Uri.findByCode('BL')
        if(!uriBL){
            uriBL = new Uri(code: 'BL', description: 'Balik Pagsubok').save()
        }

        //Bootstrap WeekNo
        //TODO Fill this up
        Calendar cal = Calendar.getInstance()
        cal.set(Calendar.YEAR,2016)
        println '1'+ cal.getTime()
        cal.set(Calendar.DAY_OF_YEAR,1)
        println '2'+cal.getTime()
        cal.set(Calendar.WEEK_OF_YEAR,1)
        println '3'+cal.getTime()
        println '3a'+cal.get(Calendar.WEEK_OF_YEAR)
        cal.set(Calendar.DAY_OF_WEEK,2)
        println '4'+cal.getTime()
        cal.add(Calendar.DAY_OF_YEAR,6)
        println '5'+cal.getTime()
        cal.add(Calendar.DAY_OF_YEAR,1)
        println '6'+cal.getTime()
        cal.add(Calendar.DAY_OF_YEAR,6)
        println '7'+cal.getTime()
        println '7a'+cal.get(Calendar.WEEK_OF_YEAR)


//        cal.set(Calendar.WEEK_OF_YEAR,2)
//        println cal.getTime()
//        cal.set(Calendar.DAY_OF_WEEK,3)
//        println cal.getTime()
//        println "AAAAAAAAAAAAAAAAAAAAAA:"+ cal.getWeeksInWeekYear()
//        println cal.getFirstDayOfWeek()
//        println cal.getMinimalDaysInFirstWeek()

        Date dateFrom
        Date dateTo
        Integer week
        Integer year

        println cal.getWeekYear()





    }
    def destroy = {
    }
}
