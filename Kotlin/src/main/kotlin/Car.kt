class Car(
    var brandName: String,
    var modelName: String,
    var carType : String
) :Vehicle("Four-Wheeler"){
    init{
        println("Brand: $brandName, Model: $modelName, Type: $carType")
    }

    fun changeBrandName(new: String){
        brandName = new
    }

    fun changeModelName(new1: String){
        modelName = new1
    }

    fun changeCarType(new2: String){
        carType = new2
    }
}