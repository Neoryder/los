import los.Distrito
import los.Lokal
import los.Teacher
import los.Uri
import los.WeekNumber

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
        if(!Lokal.findByLokal('Las Pi�as')){
            new Lokal(distrito:mms, lokal:'Las Pi�as', lcode: '020').save()
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
        if(!Lokal.findByLokal('Daang Hari - Malibay')){
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
        if(!Lokal.findByLokal('Para�aque')){
            new Lokal(distrito:mms, lokal:'Para�aque', lcode: '032').save()
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


        Teacher teacher = Teacher.findByAssignedNumber('07037')

        if(!Teacher.findByAssignedNumber('07037')){
            teacher = new Teacher(assignedNumber: '07037',
                    name:'Umali, Anthony M.',
                    lokal: Lokal.findByLcode('005'),
                    type:'pastor'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('11223')){
            teacher = new Teacher(assignedNumber: '11223',
                    name:'Funtaniel, Nomel Gem T. ',
                    lokal: Lokal.findByLcode('005'),
                    type:'Reg/Cls'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('10223')){
            teacher = new Teacher(assignedNumber: '10223',
                    name:'Rayray, Dexter C.',
                    lokal: Lokal.findByLcode('001'),
                    type:'Pas/FT'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('11944')){
            teacher = new Teacher(assignedNumber: '11944',
                    name:'De Lara, Lawrence Paul S.',
                    lokal: Lokal.findByLcode('001'),
                    type:'Reg/Ft'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('02710')){
            teacher = new Teacher(assignedNumber: '02710',
                    name:'Tadeja, Francisco B. ',
                    lokal: Lokal.findByLcode('002'),
                    type:'Pas/FT'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('04350')){
            teacher = new Teacher(assignedNumber: '04350',
                    name:'Kabigting, Benedicto R. ',
                    lokal: Lokal.findByLcode('002'),
                    type:'Ord/FT'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('06552')){
            teacher = new Teacher(assignedNumber: '06552',
                    name:'Pangilinan, Alejandro Jr. P.',
                    lokal: Lokal.findByLcode('002'),
                    type:'Pas/FT'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('10338')){
            teacher = new Teacher(assignedNumber: '10338',
                    name:'Cruz, Adriel M.',
                    lokal: Lokal.findByLcode('002'),
                    type:'Ord/Ojt'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('11365')){
            teacher = new Teacher(assignedNumber: '11365',
                    name:'Noble, Lou C. ',
                    lokal: Lokal.findByLcode('002'),
                    type:'Reg/OC'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('13701')){
            teacher = new Teacher(assignedNumber: '13701',
                    name:'Adovas, Kier P.',
                    lokal: Lokal.findByLcode('002'),
                    type:'3rd Year BEM'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('13723')){
            teacher = new Teacher(assignedNumber: '13723',
                    name:'Igano, Joel c.',
                    lokal: Lokal.findByLcode('002'),
                    type:'3rd Year BEM'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('13725')){
            teacher = new Teacher(assignedNumber: '13725',
                    name:'Intan, Valder G.',
                    lokal: Lokal.findByLcode('002'),
                    type:'3rd Year BEM'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('13730')){
            teacher = new Teacher(assignedNumber: '13730',
                    name:'Laid, Ronel DLV',
                    lokal: Lokal.findByLcode('002'),
                    type:'3rd Year BEM'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('13800')){
            teacher = new Teacher(assignedNumber: '13800',
                    name:'Valsorable Juan Edelrico',
                    lokal: Lokal.findByLcode('002'),
                    type:'3rd Year BEM'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('04933')){
            teacher = new Teacher(assignedNumber: '04933',
                    name:'Palad, Manuel DR. ',
                    lokal: Lokal.findByLcode('003'),
                    type:'Pas/FT'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('09435')){
            teacher = new Teacher(assignedNumber: '09435',
                    name:'Bocala, Webster II R.',
                    lokal: Lokal.findByLcode('003'),
                    type:'Ord/Asf'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('10302')){
            teacher = new Teacher(assignedNumber: '10302',
                    name:'Ang, Shandrick Earl S. ',
                    lokal: Lokal.findByLcode('003'),
                    type:'Ord/Cls'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('11999')){
            teacher = new Teacher(assignedNumber: '11999',
                    name:'Baranghay, Julius Ceasae',
                    lokal: Lokal.findByLcode('003'),
                    type:'Reg/Ft'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('12085')){
            teacher = new Teacher(assignedNumber: '12085',
                    name:'De Guzman, Mark Angelo',
                    lokal: Lokal.findByLcode('003'),
                    type:'Reg/Ft'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('12356')){
            teacher = new Teacher(assignedNumber: '12356',
                    name:'Rosario, Jenn Rich',
                    lokal: Lokal.findByLcode('003'),
                    type:'Reg/FT'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('09192')){
            teacher = new Teacher(assignedNumber: '09192',
                    name:'Gasmen, Nholan S.',
                    lokal: Lokal.findByLcode('004'),
                    type:'Pas/FT'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('09482')){
            teacher = new Teacher(assignedNumber: '09482',
                    name:'Gabillete, Jr. Bernabe P.',
                    lokal: Lokal.findByLcode('004'),
                    type:'Ord/Ojt'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('13706')){
            teacher = new Teacher(assignedNumber: '13706',
                    name:'Canja, Juan Rafael ',
                    lokal: Lokal.findByLcode('004'),
                    type:'3rd Year BEM'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('13720')){
            teacher = new Teacher(assignedNumber: '13720',
                    name:'Fediles, Bienvenido, Jr.',
                    lokal: Lokal.findByLcode('004'),
                    type:'3rd Year BEM'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('07037')){
            teacher = new Teacher(assignedNumber: '07037',
                    name:'Umali, Anthony M.',
                    lokal: Lokal.findByLcode('005'),
                    type:'Pas/FT'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('04993')){
            teacher = new Teacher(assignedNumber: '04993',
                    name:'Castillo, Marcial C. ',
                    lokal: Lokal.findByLcode('006'),
                    type:'Pas/FT'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('08809')){
            teacher = new Teacher(assignedNumber: '08809',
                    name:'Kisio, Jeyve S. ',
                    lokal: Lokal.findByLcode('006'),
                    type:'Ord/Asf'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('10940')){
            teacher = new Teacher(assignedNumber: '10940',
                    name:'Jadormio, Josephus C. ',
                    lokal: Lokal.findByLcode('006'),
                    type:'Reg.OC'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('13709')){
            teacher = new Teacher(assignedNumber: '13709',
                    name:'Dalagan, Joie',
                    lokal: Lokal.findByLcode('006'),
                    type:'3rd Year BEM'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('13739')){
            teacher = new Teacher(assignedNumber: '13739',
                    name:'Llover, Kenen E.',
                    lokal: Lokal.findByLcode('006'),
                    type:'3rd Year BEM'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('05259')){
            teacher = new Teacher(assignedNumber: '05259',
                    name:'Capistrano, Moises M.',
                    lokal: Lokal.findByLcode('007'),
                    type:'Ord/FT'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('08903')){
            teacher = new Teacher(assignedNumber: '08903',
                    name:'Pascual, Richard R. ',
                    lokal: Lokal.findByLcode('007'),
                    type:'Pas/FT'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('11701')){
            teacher = new Teacher(assignedNumber: '11701',
                    name:'Castillo, Mark Lyndon',
                    lokal: Lokal.findByLcode('007'),
                    type:'Reg/Ft'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('11710')){
            teacher = new Teacher(assignedNumber: '11710',
                    name:'Chou, Paul Isaac G.',
                    lokal: Lokal.findByLcode('007'),
                    type:'Reg/Ft'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('11884')){
            teacher = new Teacher(assignedNumber: '11884',
                    name:'Reyes, Jade Lyndon',
                    lokal: Lokal.findByLcode('007'),
                    type:'Reg/Ft'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('12124')){
            teacher = new Teacher(assignedNumber: '12124',
                    name:'Espinosa, Anthony',
                    lokal: Lokal.findByLcode('007'),
                    type:'Reg/Ft'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('05781')){
            teacher = new Teacher(assignedNumber: '05781',
                    name:'Del Cano, Gerardo V. ',
                    lokal: Lokal.findByLcode('008'),
                    type:'Pas/FT'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('05697')){
            teacher = new Teacher(assignedNumber: '05697',
                    name:'Saludarez, Ceasar A. ',
                    lokal: Lokal.findByLcode('009'),
                    type:'Pas/FT'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('13711')){
            teacher = new Teacher(assignedNumber: '13711',
                    name:'De Castro, William',
                    lokal: Lokal.findByLcode('009'),
                    type:'3rd Year BEM'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('04991')){
            teacher = new Teacher(assignedNumber: '04991',
                    name:'Carpio, Orlando C. ',
                    lokal: Lokal.findByLcode('010'),
                    type:'Ord/FT'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('06187')){
            teacher = new Teacher(assignedNumber: '06187',
                    name:'Paningbatan, Joel P. ',
                    lokal: Lokal.findByLcode('010'),
                    type:'Ord/Asf'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('06872')){
            teacher = new Teacher(assignedNumber: '06872',
                    name:'Corpuz, Rogelio D.',
                    lokal: Lokal.findByLcode('010'),
                    type:'Pas/FT'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('07513')){
            teacher = new Teacher(assignedNumber: '07513',
                    name:'Evangelista, Erwin C.',
                    lokal: Lokal.findByLcode('010'),
                    type:'Ord/Asf'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('10304')){
            teacher = new Teacher(assignedNumber: '10304',
                    name:'Apan, Christian AD.                       ',
                    lokal: Lokal.findByLcode('010'),
                    type:'Ord/OC'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('11505')){
            teacher = new Teacher(assignedNumber: '11505',
                    name:'Garcia, Paul John F.',
                    lokal: Lokal.findByLcode('010'),
                    type:'Reg/OC'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('11847')){
            teacher = new Teacher(assignedNumber: '11847',
                    name:'Opulento, Ryan Paul Q.',
                    lokal: Lokal.findByLcode('010'),
                    type:'Reg/FT'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('13734')){
            teacher = new Teacher(assignedNumber: '13734',
                    name:'Leoncio, Bench Bryan',
                    lokal: Lokal.findByLcode('010'),
                    type:'3rd Year BEM'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('06568')){
            teacher = new Teacher(assignedNumber: '06568',
                    name:'Puno, Enrique, Jr. V. ',
                    lokal: Lokal.findByLcode('011'),
                    type:'Ord/Kat'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('06979')){
            teacher = new Teacher(assignedNumber: '06979',
                    name:'Perez, Teddy P.',
                    lokal: Lokal.findByLcode('011'),
                    type:'Pas/FT'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('11141')){
            teacher = new Teacher(assignedNumber: '11141',
                    name:'Ruiz, Vincent Frank Gregor A.',
                    lokal: Lokal.findByLcode('011'),
                    type:'Reg/FT'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('11946')){
            teacher = new Teacher(assignedNumber: '11946',
                    name:'Acabado, Glenn Mark C.',
                    lokal: Lokal.findByLcode('011'),
                    type:'Reg/FT'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('12448')){
            teacher = new Teacher(assignedNumber: '12448',
                    name:'Vargas, Arvin James P.',
                    lokal: Lokal.findByLcode('011'),
                    type:'Reg/FT'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('05710')){
            teacher = new Teacher(assignedNumber: '05710',
                    name:'Sigua, Marcelino M.',
                    lokal: Lokal.findByLcode('012'),
                    type:'Pas/FT'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('6544')){
            teacher = new Teacher(assignedNumber: '6544',
                    name:'Natividad, Edgardo Sr.',
                    lokal: Lokal.findByLcode('12'),
                    type:'Ord/OJT'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('07786')){
            teacher = new Teacher(assignedNumber: '07786',
                    name:'Bravo, Ricky S. ',
                    lokal: Lokal.findByLcode('012'),
                    type:'Ord/FT'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('10156')){
            teacher = new Teacher(assignedNumber: '10156',
                    name:'Manzano, Eduardo D.',
                    lokal: Lokal.findByLcode('012'),
                    type:'Ord/FT'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('10707')){
            teacher = new Teacher(assignedNumber: '10707',
                    name:'Tibay, Emerson D. ',
                    lokal: Lokal.findByLcode('012'),
                    type:'Ord/OC'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('12444')){
            teacher = new Teacher(assignedNumber: '12444',
                    name:'Zamora, Jim Caster T.',
                    lokal: Lokal.findByLcode('012'),
                    type:'Reg/Cls'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('13803')){
            teacher = new Teacher(assignedNumber: '13803',
                    name:'Vergara, Felix Renier',
                    lokal: Lokal.findByLcode('012'),
                    type:'3rd Year BEM'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('13809')){
            teacher = new Teacher(assignedNumber: '13809',
                    name:'Zamora, Brixter Kent',
                    lokal: Lokal.findByLcode('012'),
                    type:'3rd Year BEM'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('07817')){
            teacher = new Teacher(assignedNumber: '07817',
                    name:'De Vera, Frederick B',
                    lokal: Lokal.findByLcode('013'),
                    type:'Ord/Asf'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('09050')){
            teacher = new Teacher(assignedNumber: '09050',
                    name:'Antonio, Jorgie V. ',
                    lokal: Lokal.findByLcode('013'),
                    type:'Pas/FT'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('13702')){
            teacher = new Teacher(assignedNumber: '13702',
                    name:'Amalio, Jonard',
                    lokal: Lokal.findByLcode('013'),
                    type:'3rd Year BEM'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('13728')){
            teacher = new Teacher(assignedNumber: '13728',
                    name:'Labrado, Kirk',
                    lokal: Lokal.findByLcode('013'),
                    type:'3rd Year BEM'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('07304')){
            teacher = new Teacher(assignedNumber: '07304',
                    name:'Pamintuan, Noel G. ',
                    lokal: Lokal.findByLcode('014'),
                    type:'Pas/FT'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('10872')){
            teacher = new Teacher(assignedNumber: '10872',
                    name:'Andrade, Roland W.',
                    lokal: Lokal.findByLcode('014'),
                    type:'Reg/FT'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('10915')){
            teacher = new Teacher(assignedNumber: '10915',
                    name:'Estrada, Jacob C. ',
                    lokal: Lokal.findByLcode('014'),
                    type:'Ord/OC'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('12262')){
            teacher = new Teacher(assignedNumber: '12262',
                    name:'Mejia, Michael G. ',
                    lokal: Lokal.findByLcode('014'),
                    type:'Reg/FT'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('13713')){
            teacher = new Teacher(assignedNumber: '13713',
                    name:'Dela Fuente, Franklin A.',
                    lokal: Lokal.findByLcode('014'),
                    type:'3rd Year BEM'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('13744')){
            teacher = new Teacher(assignedNumber: '13744',
                    name:'Magcalas, Ivan Myco',
                    lokal: Lokal.findByLcode('014'),
                    type:'3rd Year BEM'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('13754')){
            teacher = new Teacher(assignedNumber: '13754',
                    name:'Melgar, Rustom',
                    lokal: Lokal.findByLcode('014'),
                    type:'3rd Year BEM'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('13795')){
            teacher = new Teacher(assignedNumber: '13795',
                    name:'Tenoso, Reynaldo, Jr.',
                    lokal: Lokal.findByLcode('014'),
                    type:'3rd Year BEM'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('06707')){
            teacher = new Teacher(assignedNumber: '06707',
                    name:'Flores, Remel DG.',
                    lokal: Lokal.findByLcode('015'),
                    type:'Pas/FT'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('13717')){
            teacher = new Teacher(assignedNumber: '13717',
                    name:'Esmeria, Mark Anthony Gerome',
                    lokal: Lokal.findByLcode('015'),
                    type:'3rd Year BEM'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('13807')){
            teacher = new Teacher(assignedNumber: '13807',
                    name:'Viñas, Matthew',
                    lokal: Lokal.findByLcode('015'),
                    type:'3rd Year BEM'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('00932')){
            teacher = new Teacher(assignedNumber: '00932',
                    name:'Baranghay, Rogelio Sr. F. ',
                    lokal: Lokal.findByLcode('016'),
                    type:'Ord/FT'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('05584')){
            teacher = new Teacher(assignedNumber: '05584',
                    name:'Gindoy, Glenn P.',
                    lokal: Lokal.findByLcode('016'),
                    type:'Pas/FT'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('13773')){
            teacher = new Teacher(assignedNumber: '13773',
                    name:'Padilla, Mark Anthony',
                    lokal: Lokal.findByLcode('016'),
                    type:'3rd Year BEM'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('08417')){
            teacher = new Teacher(assignedNumber: '08417',
                    name:'Mina, Allan A.',
                    lokal: Lokal.findByLcode('017'),
                    type:'Ord/Asf'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('08520')){
            teacher = new Teacher(assignedNumber: '08520',
                    name:'Saquilayan, Romeo P.',
                    lokal: Lokal.findByLcode('017'),
                    type:'Pas/FT'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('11146')){
            teacher = new Teacher(assignedNumber: '11146',
                    name:'San Gabriel, Ralph Jerome D.',
                    lokal: Lokal.findByLcode('017'),
                    type:'Reg/Cls'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('11614')){
            teacher = new Teacher(assignedNumber: '11614',
                    name:'Santos, Evin Donner L. ',
                    lokal: Lokal.findByLcode('017'),
                    type:'Reg/OC'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('11745')){
            teacher = new Teacher(assignedNumber: '11745',
                    name:'Dumanon, Crisanto, Jr. A.',
                    lokal: Lokal.findByLcode('017'),
                    type:'Reg/FT'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('12233')){
            teacher = new Teacher(assignedNumber: '12233',
                    name:'Magsakay, Rap Nathaniel N.',
                    lokal: Lokal.findByLcode('017'),
                    type:'Reg/FT'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('13787')){
            teacher = new Teacher(assignedNumber: '13787',
                    name:'Roldan, Erano R.',
                    lokal: Lokal.findByLcode('017'),
                    type:'3rd Year BEM'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('13798')){
            teacher = new Teacher(assignedNumber: '13798',
                    name:'Valdez, Fred B.',
                    lokal: Lokal.findByLcode('017'),
                    type:'3rd Year BEM'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('05569')){
            teacher = new Teacher(assignedNumber: '05569',
                    name:'Fernandez, Gerry M.',
                    lokal: Lokal.findByLcode('018'),
                    type:'Pas/FT'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('13707')){
            teacher = new Teacher(assignedNumber: '13707',
                    name:'Castro, Aldrin E.',
                    lokal: Lokal.findByLcode('018'),
                    type:'3rd Year BEM'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('13805')){
            teacher = new Teacher(assignedNumber: '13805',
                    name:'Villanueva, Paulo P.',
                    lokal: Lokal.findByLcode('018'),
                    type:'3rd Year BEM'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('13810')){
            teacher = new Teacher(assignedNumber: '13810',
                    name:'Zaragosa, Nathaniel, Jr. T.',
                    lokal: Lokal.findByLcode('018'),
                    type:'3rd Year BEM'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('05809')){
            teacher = new Teacher(assignedNumber: '05809',
                    name:'Monterde, Ernie N.',
                    lokal: Lokal.findByLcode('019'),
                    type:'Ord/Asf'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('08984')){
            teacher = new Teacher(assignedNumber: '08984',
                    name:'Sandoz, Oñeza',
                    lokal: Lokal.findByLcode('019'),
                    type:'Pas/FT'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('10965')){
            teacher = new Teacher(assignedNumber: '10965',
                    name:'Pagaduan, Jonathan R.',
                    lokal: Lokal.findByLcode('019'),
                    type:'Reg/FT'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('11833')){
            teacher = new Teacher(assignedNumber: '11833',
                    name:'Miranda, Mark Andrew',
                    lokal: Lokal.findByLcode('019'),
                    type:'Reg/FT'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('11975')){
            teacher = new Teacher(assignedNumber: '11975',
                    name:'Angeles, Mark Gil',
                    lokal: Lokal.findByLcode('019'),
                    type:'Reg/FT'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('07409')){
            teacher = new Teacher(assignedNumber: '07409',
                    name:'Bauden, Henobe D. ',
                    lokal: Lokal.findByLcode('020'),
                    type:'Pas/FT'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('10921')){
            teacher = new Teacher(assignedNumber: '10921',
                    name:'Fesariton, Nomelif Bryan  Q. ',
                    lokal: Lokal.findByLcode('020'),
                    type:'Reg/OC'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('10962')){
            teacher = new Teacher(assignedNumber: '10962',
                    name:'Oraa, Jose Carlo SJ. ',
                    lokal: Lokal.findByLcode('020'),
                    type:'Reg/OC'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('13712')){
            teacher = new Teacher(assignedNumber: '13712',
                    name:'De Ocampo, Jr. Danilo M.',
                    lokal: Lokal.findByLcode('020'),
                    type:'3rd Year BEM'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('13760')){
            teacher = new Teacher(assignedNumber: '13760',
                    name:'Natividad, Jr. Edgardo B.',
                    lokal: Lokal.findByLcode('020'),
                    type:'3rd Year BEM'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('05823')){
            teacher = new Teacher(assignedNumber: '05823',
                    name:'Mahinay, Gerson C.',
                    lokal: Lokal.findByLcode('021'),
                    type:'Pas/FT'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('05909')){
            teacher = new Teacher(assignedNumber: '05909',
                    name:'Diaz, Emmanuel DLR. ',
                    lokal: Lokal.findByLcode('021'),
                    type:'Ord/OC'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('08490')){
            teacher = new Teacher(assignedNumber: '08490',
                    name:'Recolizado, Efren S.',
                    lokal: Lokal.findByLcode('021'),
                    type:'Ord/OC'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('10334')){
            teacher = new Teacher(assignedNumber: '10334',
                    name:'Casamayor, Ian L. ',
                    lokal: Lokal.findByLcode('021'),
                    type:'Reg/Cls'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('10390')){
            teacher = new Teacher(assignedNumber: '10390',
                    name:'Llagas, Nemesio, Jr.',
                    lokal: Lokal.findByLcode('021'),
                    type:'Ord/Asf'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('10576')){
            teacher = new Teacher(assignedNumber: '10576',
                    name:'De Jesus, John Joseph',
                    lokal: Lokal.findByLcode('021'),
                    type:'Ord/Asf'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('13722')){
            teacher = new Teacher(assignedNumber: '13722',
                    name:'Grande, Reden G.',
                    lokal: Lokal.findByLcode('021'),
                    type:'3rd Year BEM'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('13738')){
            teacher = new Teacher(assignedNumber: '13738',
                    name:'Llorente, Leomimarc John',
                    lokal: Lokal.findByLcode('021'),
                    type:'3rd Year BEM'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('13758')){
            teacher = new Teacher(assignedNumber: '13758',
                    name:'Nalo, Kim',
                    lokal: Lokal.findByLcode('021'),
                    type:'3rd Year BEM'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('13777')){
            teacher = new Teacher(assignedNumber: '13777',
                    name:'Paniza, Froilan L.',
                    lokal: Lokal.findByLcode('021'),
                    type:'3rd Year BEM'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('13785')){
            teacher = new Teacher(assignedNumber: '13785',
                    name:'Ramirez, Cyrel Sean',
                    lokal: Lokal.findByLcode('021'),
                    type:'3rd Year BEM'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('13801')){
            teacher = new Teacher(assignedNumber: '13801',
                    name:'Venida, Thirdee',
                    lokal: Lokal.findByLcode('021'),
                    type:'3rd Year BEM'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('09829')){
            teacher = new Teacher(assignedNumber: '09829',
                    name:'Nabatilan, George V.',
                    lokal: Lokal.findByLcode('022'),
                    type:'Pas/FT'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('10140')){
            teacher = new Teacher(assignedNumber: '10140',
                    name:'Madarang, Gerald T',
                    lokal: Lokal.findByLcode('022'),
                    type:'Ord/OC'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('10479')){
            teacher = new Teacher(assignedNumber: '10479',
                    name:'Santos, Randy A. ',
                    lokal: Lokal.findByLcode('022'),
                    type:'Pas/FT'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('11082')){
            teacher = new Teacher(assignedNumber: '11082',
                    name:'Evangelista, Ariel Teodoro J. ',
                    lokal: Lokal.findByLcode('022'),
                    type:'Reg/Cls'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('13737')){
            teacher = new Teacher(assignedNumber: '13737',
                    name:'Liquido, Reggie B.',
                    lokal: Lokal.findByLcode('022'),
                    type:'3rd Year BEM'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('13742')){
            teacher = new Teacher(assignedNumber: '13742',
                    name:'Lumbar, Jerson T.',
                    lokal: Lokal.findByLcode('022'),
                    type:'3rd Year BEM'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('13762')){
            teacher = new Teacher(assignedNumber: '13762',
                    name:'Naz, Mark Jed V',
                    lokal: Lokal.findByLcode('022'),
                    type:'3rd Year BEM'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('13767')){
            teacher = new Teacher(assignedNumber: '13767',
                    name:'Ocado, Jeimer Jerry II E.',
                    lokal: Lokal.findByLcode('022'),
                    type:'3rd Year BEM'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('13774')){
            teacher = new Teacher(assignedNumber: '13774',
                    name:'Padilla, Nonato, Jr. B.',
                    lokal: Lokal.findByLcode('022'),
                    type:'3rd Year BEM'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('13789')){
            teacher = new Teacher(assignedNumber: '13789',
                    name:'Sagun Dan Airone',
                    lokal: Lokal.findByLcode('022'),
                    type:'3rd Year BEM'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('13808')){
            teacher = new Teacher(assignedNumber: '13808',
                    name:'Yutrago, Leovin DR.',
                    lokal: Lokal.findByLcode('022'),
                    type:'3rd Year BEM'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('13802')){
            teacher = new Teacher(assignedNumber: '13802',
                    name:'Ventilacion, Ariesbill',
                    lokal: Lokal.findByLcode('023'),
                    type:'3rd Year BEM'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('05898')){
            teacher = new Teacher(assignedNumber: '05898',
                    name:'De Castro, Buenaventura Jr. Y.  ',
                    lokal: Lokal.findByLcode('024'),
                    type:'Pas/FT'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('08254')){
            teacher = new Teacher(assignedNumber: '08254',
                    name:'Cortez, Donald P.',
                    lokal: Lokal.findByLcode('025'),
                    type:'Pas/FT'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('10882')){
            teacher = new Teacher(assignedNumber: '10882',
                    name:'Bocobo, Jesse Anthony R.',
                    lokal: Lokal.findByLcode('025'),
                    type:'Ord/ft'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('12131')){
            teacher = new Teacher(assignedNumber: '12131',
                    name:'Fadalan, Riel',
                    lokal: Lokal.findByLcode('025'),
                    type:'Reg/FT'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('06185')){
            teacher = new Teacher(assignedNumber: '06185',
                    name:'Palma, Wilson F. ',
                    lokal: Lokal.findByLcode('026'),
                    type:'Pas/FT'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('08557')){
            teacher = new Teacher(assignedNumber: '08557',
                    name:'Vergara, Venerando S.',
                    lokal: Lokal.findByLcode('026'),
                    type:'Ord/Asf'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('09267')){
            teacher = new Teacher(assignedNumber: '09267',
                    name:'Nicolas, Limuel S.',
                    lokal: Lokal.findByLcode('026'),
                    type:'Ord/Asf'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('10974')){
            teacher = new Teacher(assignedNumber: '10974',
                    name:'Pingol, Jefferson B. ',
                    lokal: Lokal.findByLcode('026'),
                    type:'Reg/OC'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('11499')){
            teacher = new Teacher(assignedNumber: '11499',
                    name:'Fontillas, Tyron Lee F. ',
                    lokal: Lokal.findByLcode('026'),
                    type:'Reg/FT'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('11915')){
            teacher = new Teacher(assignedNumber: '11915',
                    name:'Talagtag, Frederick S.',
                    lokal: Lokal.findByLcode('026'),
                    type:'Reg/FT'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('13727')){
            teacher = new Teacher(assignedNumber: '13727',
                    name:'Joseph, Karl Ed D.',
                    lokal: Lokal.findByLcode('026'),
                    type:'3rd Year BEM'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('13750')){
            teacher = new Teacher(assignedNumber: '13750',
                    name:'Maque, Anthonym B.',
                    lokal: Lokal.findByLcode('026'),
                    type:'3rd Year BEM'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('13769')){
            teacher = new Teacher(assignedNumber: '13769',
                    name:'Ondagan, Franzes Jorge',
                    lokal: Lokal.findByLcode('026'),
                    type:'3rd Year BEM'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('13791')){
            teacher = new Teacher(assignedNumber: '13791',
                    name:'Sena, Sharwin C.',
                    lokal: Lokal.findByLcode('026'),
                    type:'3rd Year BEM'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('13799')){
            teacher = new Teacher(assignedNumber: '13799',
                    name:'Valdez, John Michael Vincent',
                    lokal: Lokal.findByLcode('026'),
                    type:'3rd Year BEM'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('05853')){
            teacher = new Teacher(assignedNumber: '05853',
                    name:'Apatan, Enribello Q.',
                    lokal: Lokal.findByLcode('027'),
                    type:'Pas/FT'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('5971')){
            teacher = new Teacher(assignedNumber: '5971',
                    name:'Pingol, Roland',
                    lokal: Lokal.findByLcode('027'),
                    type:'Ord/OJT'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('07035')){
            teacher = new Teacher(assignedNumber: '07035',
                    name:'Tuazon, Rolly P.',
                    lokal: Lokal.findByLcode('027'),
                    type:'Pas/FT'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('08554')){
            teacher = new Teacher(assignedNumber: '08554',
                    name:'Valiente, Enrique',
                    lokal: Lokal.findByLcode('027'),
                    type:'Ord/OJT'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('09046')){
            teacher = new Teacher(assignedNumber: '09046',
                    name:'Amorosa, Carlo Ira A.',
                    lokal: Lokal.findByLcode('027'),
                    type:'Ord/Asf'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('10388')){
            teacher = new Teacher(assignedNumber: '10388',
                    name:'Lim, Vladimir L. ',
                    lokal: Lokal.findByLcode('027'),
                    type:'Ord/Cls'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('11095')){
            teacher = new Teacher(assignedNumber: '11095',
                    name:'Gutierrez, Ed Owen P. ',
                    lokal: Lokal.findByLcode('027'),
                    type:'Reg/OC'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('11153')){
            teacher = new Teacher(assignedNumber: '11153',
                    name:'Supremo, Christian N.',
                    lokal: Lokal.findByLcode('027'),
                    type:'Reg/OC'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('12257')){
            teacher = new Teacher(assignedNumber: '12257',
                    name:'Martinez, Wilson D.',
                    lokal: Lokal.findByLcode('027'),
                    type:'Reg/FT'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('12372')){
            teacher = new Teacher(assignedNumber: '12372',
                    name:'Gomez, Buenventura Jr. B. ',
                    lokal: Lokal.findByLcode('027'),
                    type:'Reg/OC'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('13703')){
            teacher = new Teacher(assignedNumber: '13703',
                    name:'Ballocanag, Marco Eleazar',
                    lokal: Lokal.findByLcode('027'),
                    type:'3rd Year BEM'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('13719')){
            teacher = new Teacher(assignedNumber: '13719',
                    name:'Falogme, Franklin',
                    lokal: Lokal.findByLcode('027'),
                    type:'3rd Year BEM'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('13724')){
            teacher = new Teacher(assignedNumber: '13724',
                    name:'Ilogon, Danpher',
                    lokal: Lokal.findByLcode('027'),
                    type:'3rd Year BEM'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('13764')){
            teacher = new Teacher(assignedNumber: '13764',
                    name:'Nermal, Jernel John',
                    lokal: Lokal.findByLcode('027'),
                    type:'3rd Year BEM'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('13778')){
            teacher = new Teacher(assignedNumber: '13778',
                    name:'Paragsa, Karl Louise',
                    lokal: Lokal.findByLcode('027'),
                    type:'3rd Year BEM'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('13786')){
            teacher = new Teacher(assignedNumber: '13786',
                    name:'Rivera Johnvy Boy',
                    lokal: Lokal.findByLcode('027'),
                    type:'3rd Year BEM'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('13792')){
            teacher = new Teacher(assignedNumber: '13792',
                    name:'Soria, Nelson',
                    lokal: Lokal.findByLcode('027'),
                    type:'3rd Year BEM'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('13793')){
            teacher = new Teacher(assignedNumber: '13793',
                    name:'Sumaganday, Glen',
                    lokal: Lokal.findByLcode('027'),
                    type:'3rd Year BEM'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('08562')){
            teacher = new Teacher(assignedNumber: '08562',
                    name:'Villanueva, Ariel N. ',
                    lokal: Lokal.findByLcode('028'),
                    type:'Pas/FT'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('09685')){
            teacher = new Teacher(assignedNumber: '09685',
                    name:'Cabanayan, Raymond ',
                    lokal: Lokal.findByLcode('028'),
                    type:'Ord.OC'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('10969')){
            teacher = new Teacher(assignedNumber: '10969',
                    name:'Parale, Pastor II B.',
                    lokal: Lokal.findByLcode('028'),
                    type:'Reg/OC'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('11006')){
            teacher = new Teacher(assignedNumber: '11006',
                    name:'Tatel, Vergel Angelo Y.  ',
                    lokal: Lokal.findByLcode('028'),
                    type:'Reg/OC'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('11017')){
            teacher = new Teacher(assignedNumber: '11017',
                    name:'Valdez, Surix R.',
                    lokal: Lokal.findByLcode('028'),
                    type:'Ord.OC'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('13714')){
            teacher = new Teacher(assignedNumber: '13714',
                    name:'Demencillo, Juneil',
                    lokal: Lokal.findByLcode('028'),
                    type:'3rd Year BEM'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('13733')){
            teacher = new Teacher(assignedNumber: '13733',
                    name:'Latonio, Temotio, Jr.',
                    lokal: Lokal.findByLcode('028'),
                    type:'3rd Year BEM'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('13746')){
            teacher = new Teacher(assignedNumber: '13746',
                    name:'Melendres, Ahmar',
                    lokal: Lokal.findByLcode('028'),
                    type:'3rd Year BEM'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('13763')){
            teacher = new Teacher(assignedNumber: '13763',
                    name:'Nepalis, Federico III',
                    lokal: Lokal.findByLcode('028'),
                    type:'3rd Year BEM'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('13775')){
            teacher = new Teacher(assignedNumber: '13775',
                    name:'Paloma, Jeric',
                    lokal: Lokal.findByLcode('028'),
                    type:'3rd Year BEM'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('13779')){
            teacher = new Teacher(assignedNumber: '13779',
                    name:'Peralta, Jan Anthony',
                    lokal: Lokal.findByLcode('028'),
                    type:'3rd Year BEM'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('10211')){
            teacher = new Teacher(assignedNumber: '10211',
                    name:'Pocopio, Marnel S. ',
                    lokal: Lokal.findByLcode('029'),
                    type:'Ord/OC'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('10407')){
            teacher = new Teacher(assignedNumber: '10407',
                    name:'Malonzo, Lexer C. ',
                    lokal: Lokal.findByLcode('029'),
                    type:'Pas/FT'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('10893')){
            teacher = new Teacher(assignedNumber: '10893',
                    name:'Cecillano, Allan C. ',
                    lokal: Lokal.findByLcode('029'),
                    type:'Reg/OC'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('10899')){
            teacher = new Teacher(assignedNumber: '10899',
                    name:'De Leon, Arnold T.',
                    lokal: Lokal.findByLcode('029'),
                    type:'Ord/Asf'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('11000')){
            teacher = new Teacher(assignedNumber: '11000',
                    name:'Sepillo,  Joven, Jr. D. ',
                    lokal: Lokal.findByLcode('029'),
                    type:'Ord/OC'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('11430')){
            teacher = new Teacher(assignedNumber: '11430',
                    name:'Bobis, Gemmar M. ',
                    lokal: Lokal.findByLcode('029'),
                    type:'Reg/FT'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('13710')){
            teacher = new Teacher(assignedNumber: '13710',
                    name:'Daza, Stephen Rey',
                    lokal: Lokal.findByLcode('029'),
                    type:'3rd Year BEM'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('13718')){
            teacher = new Teacher(assignedNumber: '13718',
                    name:'Evasco, Eugene E.',
                    lokal: Lokal.findByLcode('029'),
                    type:'3rd Year BEM'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('13746')){
            teacher = new Teacher(assignedNumber: '13746',
                    name:'Malaluan, Kevin Henry I.',
                    lokal: Lokal.findByLcode('029'),
                    type:'3rd Year BEM'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('13757')){
            teacher = new Teacher(assignedNumber: '13757',
                    name:'Minor, John Alvin A.',
                    lokal: Lokal.findByLcode('029'),
                    type:'3rd Year BEM'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('13765')){
            teacher = new Teacher(assignedNumber: '13765',
                    name:'Obniala, Armando',
                    lokal: Lokal.findByLcode('029'),
                    type:'3rd Year BEM'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('13771')){
            teacher = new Teacher(assignedNumber: '13771',
                    name:'Opiasa, Rovin E.',
                    lokal: Lokal.findByLcode('029'),
                    type:'3rd Year BEM'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('13782')){
            teacher = new Teacher(assignedNumber: '13782',
                    name:'Perez, Reymart H.',
                    lokal: Lokal.findByLcode('029'),
                    type:'3rd Year BEM'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('09182')){
            teacher = new Teacher(assignedNumber: '09182',
                    name:'Galileo, Richard M. ',
                    lokal: Lokal.findByLcode('030'),
                    type:'Pas/FT'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('10878')){
            teacher = new Teacher(assignedNumber: '10878',
                    name:'Baltazar, Ismael A. ',
                    lokal: Lokal.findByLcode('030'),
                    type:'Reg/OC'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('13726')){
            teacher = new Teacher(assignedNumber: '13726',
                    name:'Intig, Waron P.',
                    lokal: Lokal.findByLcode('030'),
                    type:'3rd Year BEM'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('13751')){
            teacher = new Teacher(assignedNumber: '13751',
                    name:'Masabot, Jek C.',
                    lokal: Lokal.findByLcode('030'),
                    type:'3rd Year BEM'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('13759')){
            teacher = new Teacher(assignedNumber: '13759',
                    name:'Natividad, Chad Z.',
                    lokal: Lokal.findByLcode('030'),
                    type:'3rd Year BEM'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('02609')){
            teacher = new Teacher(assignedNumber: '02609',
                    name:'Martinez, Manuel P.',
                    lokal: Lokal.findByLcode('031'),
                    type:'Pas/FT'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('10197')){
            teacher = new Teacher(assignedNumber: '10197',
                    name:'Palisoc, Alejandro D. ',
                    lokal: Lokal.findByLcode('031'),
                    type:'Ord/OC'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('13768')){
            teacher = new Teacher(assignedNumber: '13768',
                    name:'Occasion, Francisco R.',
                    lokal: Lokal.findByLcode('031'),
                    type:'3rd Year BEM'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('13776')){
            teacher = new Teacher(assignedNumber: '13776',
                    name:'Pangan, Jay-son O.',
                    lokal: Lokal.findByLcode('031'),
                    type:'3rd Year BEM'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('03426')){
            teacher = new Teacher(assignedNumber: '03426',
                    name:'Laksamana, Jr. Onorio E. ',
                    lokal: Lokal.findByLcode('034'),
                    type:'Ord/FT'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('08010')){
            teacher = new Teacher(assignedNumber: '08010',
                    name:'Catriz, Ronald D.',
                    lokal: Lokal.findByLcode('034'),
                    type:'Pas/FT'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('13721')){
            teacher = new Teacher(assignedNumber: '13721',
                    name:'Garaiz, Egie E.',
                    lokal: Lokal.findByLcode('034'),
                    type:'3rd Year BEM'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('13749')){
            teacher = new Teacher(assignedNumber: '13749',
                    name:'Manzanilla, Amiel Cezar',
                    lokal: Lokal.findByLcode('034'),
                    type:'3rd Year BEM'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('13770')){
            teacher = new Teacher(assignedNumber: '13770',
                    name:'Oneal, Alfred, Jr. U.',
                    lokal: Lokal.findByLcode('034'),
                    type:'3rd Year BEM'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('13788')){
            teacher = new Teacher(assignedNumber: '13788',
                    name:'Romaguera, Eljun E.',
                    lokal: Lokal.findByLcode('034'),
                    type:'3rd Year BEM'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('13806')){
            teacher = new Teacher(assignedNumber: '13806',
                    name:'Viloria, John Marwin N.',
                    lokal: Lokal.findByLcode('034'),
                    type:'3rd Year BEM'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('08169')){
            teacher = new Teacher(assignedNumber: '08169',
                    name:'Almirol, Alfred, Jr.',
                    lokal: Lokal.findByLcode('035'),
                    type:'Ord/OC'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('10307')){
            teacher = new Teacher(assignedNumber: '10307',
                    name:'Avila, Allan A.',
                    lokal: Lokal.findByLcode('035'),
                    type:'Pas/FT'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('10468')){
            teacher = new Teacher(assignedNumber: '10468',
                    name:'Roa, Dexter D.',
                    lokal: Lokal.findByLcode('035'),
                    type:'Ord/OC'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('13704')){
            teacher = new Teacher(assignedNumber: '13704',
                    name:'Barbecho, Louie',
                    lokal: Lokal.findByLcode('035'),
                    type:'3rd Year BEM'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('13705')){
            teacher = new Teacher(assignedNumber: '13705',
                    name:'Caldona, Justin',
                    lokal: Lokal.findByLcode('035'),
                    type:'3rd Year BEM'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('13741')){
            teacher = new Teacher(assignedNumber: '13741',
                    name:'Luansing, Kenn Ralph',
                    lokal: Lokal.findByLcode('035'),
                    type:'3rd Year BEM'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('13748')){
            teacher = new Teacher(assignedNumber: '13748',
                    name:'Manuba, Mark Angel',
                    lokal: Lokal.findByLcode('035'),
                    type:'3rd Year BEM'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('13755')){
            teacher = new Teacher(assignedNumber: '13755',
                    name:'Mendoza, Alexander, Jr.',
                    lokal: Lokal.findByLcode('035'),
                    type:'3rd Year BEM'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('13756')){
            teacher = new Teacher(assignedNumber: '13756',
                    name:'Minglana, Jerson',
                    lokal: Lokal.findByLcode('035'),
                    type:'3rd Year BEM'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('07350')){
            teacher = new Teacher(assignedNumber: '07350',
                    name:'Figueroa, Generoso P.',
                    lokal: Lokal.findByLcode('036'),
                    type:'Pas/FT'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('10875')){
            teacher = new Teacher(assignedNumber: '10875',
                    name:'Aspe, Normel P.',
                    lokal: Lokal.findByLcode('036'),
                    type:'Ord/OC'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('10943')){
            teacher = new Teacher(assignedNumber: '10943',
                    name:'Josol, Rebie L. ',
                    lokal: Lokal.findByLcode('036'),
                    type:'Reg.OC'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('11607')){
            teacher = new Teacher(assignedNumber: '11607',
                    name:'Salenga, Donel C. ',
                    lokal: Lokal.findByLcode('036'),
                    type:'Reg.OC'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('13716')){
            teacher = new Teacher(assignedNumber: '13716',
                    name:'Ercia, Christian Jacob',
                    lokal: Lokal.findByLcode('036'),
                    type:'3rd Year BEM'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('13745')){
            teacher = new Teacher(assignedNumber: '13745',
                    name:'Maglasang, Raffy',
                    lokal: Lokal.findByLcode('036'),
                    type:'3rd Year BEM'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('13780')){
            teacher = new Teacher(assignedNumber: '13780',
                    name:'Pereda, Reymark',
                    lokal: Lokal.findByLcode('036'),
                    type:'3rd Year BEM'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('08806')){
            teacher = new Teacher(assignedNumber: '08806',
                    name:'Jimenez, Eliseo, Jr. D. ',
                    lokal: Lokal.findByLcode('037'),
                    type:'Pas/FT'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('12256')){
            teacher = new Teacher(assignedNumber: '12256',
                    name:'Martin, Mark Anthony P.',
                    lokal: Lokal.findByLcode('037'),
                    type:'Reg/Cls'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('13751')){
            teacher = new Teacher(assignedNumber: '13751',
                    name:'Masabot, Jem G.',
                    lokal: Lokal.findByLcode('037'),
                    type:'3rd Year BEM'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('13761')){
            teacher = new Teacher(assignedNumber: '13761',
                    name:'Natividad, Edrick B.',
                    lokal: Lokal.findByLcode('037'),
                    type:'3rd Year BEM'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('04874')){
            teacher = new Teacher(assignedNumber: '04874',
                    name:'Malawig, Marvin R.',
                    lokal: Lokal.findByLcode('038'),
                    type:'Pas/FT'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('10931')){
            teacher = new Teacher(assignedNumber: '10931',
                    name:'Gener, Socrates Claudio M. ',
                    lokal: Lokal.findByLcode('038'),
                    type:'Reg/OC'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('13804')){
            teacher = new Teacher(assignedNumber: '13804',
                    name:'Viduya, Arel Job',
                    lokal: Lokal.findByLcode('038'),
                    type:'3rd Year BEM'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('08453')){
            teacher = new Teacher(assignedNumber: '08453',
                    name:'Panopio, Ruel P. ',
                    lokal: Lokal.findByLcode('039'),
                    type:'Pas/FT'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('10959')){
            teacher = new Teacher(assignedNumber: '10959',
                    name:'Morata, Kiru S. ',
                    lokal: Lokal.findByLcode('039'),
                    type:'Reg.FT'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('12387')){
            teacher = new Teacher(assignedNumber: '12387',
                    name:'Suratos, Edger John C',
                    lokal: Lokal.findByLcode('039'),
                    type:'Reg/FT'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('12434')){
            teacher = new Teacher(assignedNumber: '12434',
                    name:'Viloria, Emil S.',
                    lokal: Lokal.findByLcode('039'),
                    type:'Reg.FT'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('02939')){
            teacher = new Teacher(assignedNumber: '02939',
                    name:'Reyes, Romeo  V. ',
                    lokal: Lokal.findByLcode('040'),
                    type:'Pas/FT'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('11993')){
            teacher = new Teacher(assignedNumber: '11993',
                    name:'Pondolan, Gefferd B.',
                    lokal: Lokal.findByLcode('040'),
                    type:'3rd Year BEM'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('13731')){
            teacher = new Teacher(assignedNumber: '13731',
                    name:'Lambojon , Ernie A.',
                    lokal: Lokal.findByLcode('040'),
                    type:'3rd Year BEM'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('13743')){
            teacher = new Teacher(assignedNumber: '13743',
                    name:'Luna, Joevie G.',
                    lokal: Lokal.findByLcode('040'),
                    type:'3rd Year BEM'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('07523')){
            teacher = new Teacher(assignedNumber: '07523',
                    name:'Fernando, Sony  M.',
                    lokal: Lokal.findByLcode('041'),
                    type:'Pas/FT'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('11853')){
            teacher = new Teacher(assignedNumber: '11853',
                    name:'Pabayo, Liftgarret',
                    lokal: Lokal.findByLcode('041'),
                    type:'Reg.FT'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('12400')){
            teacher = new Teacher(assignedNumber: '12400',
                    name:'Tolentino, Al Jerome',
                    lokal: Lokal.findByLcode('041'),
                    type:'Reg.FT'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('13715')){
            teacher = new Teacher(assignedNumber: '13715',
                    name:'Duazo, Walter Van',
                    lokal: Lokal.findByLcode('041'),
                    type:'3rd Year BEM'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('13796')){
            teacher = new Teacher(assignedNumber: '13796',
                    name:'Torralba, Julian Christopher ',
                    lokal: Lokal.findByLcode('041'),
                    type:'3rd Year BEM'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('04621')){
            teacher = new Teacher(assignedNumber: '04621',
                    name:'Reyes, Melchor T.',
                    lokal: Lokal.findByLcode('042'),
                    type:'Pas/FT'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('06884')){
            teacher = new Teacher(assignedNumber: '06884',
                    name:'David, Ernesto L.',
                    lokal: Lokal.findByLcode('042'),
                    type:'Ord/Asf'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('07014')){
            teacher = new Teacher(assignedNumber: '07014',
                    name:'Santos, Erdy M. ',
                    lokal: Lokal.findByLcode('042'),
                    type:'Ord/Asf'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('10006')){
            teacher = new Teacher(assignedNumber: '10006',
                    name:'Becinio, Noel A. ',
                    lokal: Lokal.findByLcode('042'),
                    type:'Ord/OC'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('10942')){
            teacher = new Teacher(assignedNumber: '10942',
                    name:'Josol, Gem L. ',
                    lokal: Lokal.findByLcode('042'),
                    type:'Reg.OC'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('11022')){
            teacher = new Teacher(assignedNumber: '11022',
                    name:'Villanueva, Michael Angelo B.',
                    lokal: Lokal.findByLcode('042'),
                    type:'Ord/OC'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('13735')){
            teacher = new Teacher(assignedNumber: '13735',
                    name:'Limas, Rey Anthony A.',
                    lokal: Lokal.findByLcode('042'),
                    type:'3rd Year BEM'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('13740')){
            teacher = new Teacher(assignedNumber: '13740',
                    name:'Lopez, Rey M.',
                    lokal: Lokal.findByLcode('042'),
                    type:'3rd Year BEM'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('13784')){
            teacher = new Teacher(assignedNumber: '13784',
                    name:'Punsaran, Israel H.',
                    lokal: Lokal.findByLcode('042'),
                    type:'3rd Year BEM'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('13790')){
            teacher = new Teacher(assignedNumber: '13790',
                    name:'Sayson, Renez Marrion A.',
                    lokal: Lokal.findByLcode('042'),
                    type:'3rd Year BEM'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('08842')){
            teacher = new Teacher(assignedNumber: '08842',
                    name:'Manglicmot, Dennis T. ',
                    lokal: Lokal.findByLcode('043'),
                    type:'Pas/FT'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('13708')){
            teacher = new Teacher(assignedNumber: '13708',
                    name:'Cusay, Ricaby',
                    lokal: Lokal.findByLcode('043'),
                    type:'3rd Year BEM'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('13732')){
            teacher = new Teacher(assignedNumber: '13732',
                    name:'Lastra, Cary',
                    lokal: Lokal.findByLcode('043'),
                    type:'3rd Year BEM'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('13747')){
            teacher = new Teacher(assignedNumber: '13747',
                    name:'Mana, Gerald',
                    lokal: Lokal.findByLcode('043'),
                    type:'3rd Year BEM'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('08987')){
            teacher = new Teacher(assignedNumber: '08987',
                    name:'Umali, Dexter C.',
                    lokal: Lokal.findByLcode('044'),
                    type:'Ord/FT'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('10408')){
            teacher = new Teacher(assignedNumber: '10408',
                    name:'Malinas, Jayson',
                    lokal: Lokal.findByLcode('044'),
                    type:'Pas/FT'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('07734')){
            teacher = new Teacher(assignedNumber: '07734',
                    name:'Villamayor, Alejandro A. ',
                    lokal: Lokal.findByLcode('045'),
                    type:'Pas/FT'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('10994')){
            teacher = new Teacher(assignedNumber: '10994',
                    name:'Sandoval, Blas Mc. Gyver F. ',
                    lokal: Lokal.findByLcode('045'),
                    type:'Reg.FT'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('13729')){
            teacher = new Teacher(assignedNumber: '13729',
                    name:'Lagmay, Renz Aaron',
                    lokal: Lokal.findByLcode('045'),
                    type:'3rd Year BEM'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('09665')){
            teacher = new Teacher(assignedNumber: '09665',
                    name:'Bartolo, Eraño B.',
                    lokal: Lokal.findByLcode('048'),
                    type:'Pas/FT'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('09005')){
            teacher = new Teacher(assignedNumber: '09005',
                    name:'Ynot, Joshua Paean',
                    lokal: Lokal.findByLcode('050'),
                    type:'Pas/FT'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('09875')){
            teacher = new Teacher(assignedNumber: '09875',
                    name:'Reyes, Amado L. II',
                    lokal: Lokal.findByLcode('050'),
                    type:'Pas/FT'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('11051')){
            teacher = new Teacher(assignedNumber: '11051',
                    name:'Binasoy,Glenn B.',
                    lokal: Lokal.findByLcode('051'),
                    type:'Reg/FT'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('12428')){
            teacher = new Teacher(assignedNumber: '12428',
                    name:'Villanueva, Hector E.',
                    lokal: Lokal.findByLcode('050'),
                    type:'Reg/FT'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('13797')){
            teacher = new Teacher(assignedNumber: '13797',
                    name:'Tuazon, Ric Amiel',
                    lokal: Lokal.findByLcode('050'),
                    type:'3rd Year BEM'
            ).save()
        }
        if(!Teacher.findByAssignedNumber('13772')){
            teacher = new Teacher(assignedNumber: '13772',
                    name:'Ordoñez, Mark Vincent A.',
                    lokal: Lokal.findByLcode('040'),
                    type:'3rd Year BEM'
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

        Date dateFrom
        Date dateTo
        Integer year = 2016
        Integer week = 1
        //Bootstrap WeekNo
        //TODO Fill this up
        Calendar cal = Calendar.getInstance()
        cal.set(Calendar.YEAR,2016)
        cal.set(Calendar.HOUR,0)
        cal.set(Calendar.MINUTE,0)
        cal.set(Calendar.SECOND,0)
        cal.set(Calendar.MILLISECOND,0)
//        println '1'+ cal.getTime()
        cal.set(Calendar.DAY_OF_YEAR,1)
//        println '2'+cal.getTime()
        cal.set(Calendar.WEEK_OF_YEAR,1)
//        println '3'+cal.getTime()
//        println '3a'+cal.get(Calendar.WEEK_OF_YEAR)
        cal.set(Calendar.DAY_OF_WEEK,2)
//        println '4'+cal.getTime()
        dateTo = cal.getTime()
        cal.add(Calendar.DAY_OF_YEAR,6)
//        println '5'+cal.getTime()
        dateFrom = cal.getTime()
        week = 1



        Calendar calNewYear = Calendar.getInstance()
        calNewYear.set(Calendar.HOUR,0)
        calNewYear.set(Calendar.MINUTE,0)
        calNewYear.set(Calendar.SECOND,0)
        calNewYear.set(Calendar.MILLISECOND,0)
        calNewYear.set(Calendar.MONTH,Calendar.DECEMBER)
        calNewYear.set(Calendar.DAY_OF_MONTH,31)
//        calNewYear.add(Calendar.YEAR,1)
//        println "calNewYear:"+calNewYear.getTime()
        WeekNumber weekNo = null
if(!WeekNumber.findAllByYearAndWeek(year,week)){

    weekNo = new WeekNumber(
            dateFrom: dateFrom,
            dateTo: dateTo,
            week: week,
            year: year
    ).save()

    for (int i = 1; i <= 600; i++) {
        println "calNewYear:"+calNewYear.getTime()
        cal.add(Calendar.DAY_OF_YEAR,1)
        println i+'From'+cal.getTime()
        dateFrom = cal.getTime()
        cal.add(Calendar.DAY_OF_YEAR,6)
        println i+'To'+cal.getTime()
        dateTo = cal.getTime()
        if(calNewYear.getTime()<dateTo){
            println "BBBB"
            week=1
            year++
            println week
            println year
            weekNo = new WeekNumber(
                    dateFrom: dateFrom,
                    dateTo: dateTo,
                    week: week,
                    year: year
            ).save()
            calNewYear.add(Calendar.YEAR,1)
            week++
        } else  if(calNewYear.getTime()==dateTo) {
            println "CCCC"
            println week
            println year
            weekNo = new WeekNumber(
                    dateFrom: dateFrom,
                    dateTo: dateTo,
                    week: week,
                    year: year
            ).save()
            week=1
            year++
            calNewYear.add(Calendar.YEAR,1)
        } else {
            println "DDDD"
            println week
            println year
            weekNo = new WeekNumber(
                    dateFrom: dateFrom,
                    dateTo: dateTo,
                    week: week,
                    year: year
            ).save()
            week++
        }


        println "=================================="
    }
}



    }
    def destroy = {
    }
}
