/*
* @author Siddhesh Salve
* @since 28 Sept,2022
* */

abstract class Shape(
    var name: String
) {

    constructor(name: String, vararg dimensions: Double) :    this(name)
    init{
        println("Shape is the super class")
    }

    fun changeName(newName: String) {
        name = newName
    }

    abstract fun perimeter() : Double
    abstract fun area() : Double
}