/*
* @author Siddhesh Salve
* @since 28 Sept,2022
* */

open class Shape(
    var name: String
) {
    init{
        println("Shape is the super class")
    }

    fun changeName(newName: String) {
        name = newName
    }
}