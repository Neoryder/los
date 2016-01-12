package los

class Distrito {

    String distrito
    String dcode

    static hasMany = [lokal:Lokal]

    static constraints = {
        distrito  maxSize: 200
        dcode maxSize: 5
    }
}
