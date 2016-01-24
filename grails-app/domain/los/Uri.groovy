package los

class Uri {

    String code
    String description

    static constraints = {
        code unique: true
    }
}
