open class Vehicle(
    var type: String
) {
    init{
        println("This is a $type type vehicle.")
    }

    fun changeType(newType: String){
        type = newType
    }
}