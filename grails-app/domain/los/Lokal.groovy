package los

class Lokal {

    String lokal
    String lcode

    static belongsTo = [distrito:Distrito]

    static constraints = {
        lokal maxSize: 200
        lcode maxSize: 3
    }

    String toString(){
        return distrito.distrito+","+lokal
    }
}
