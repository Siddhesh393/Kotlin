/*
* @author Siddhesh Salve
* @since 28 Sept,2022
* */

abstract class Shape(
    protected var name: String
) {
    init{
        println("Shape is the super class")
    }

    fun changeName(newName: String) {
        name = newName
    }

    abstract fun area() : Double
}