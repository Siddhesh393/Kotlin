/*
* @author Siddhesh Salve
* @since 28 Sept,2022
* */

import kotlin.math.*

class Triangle(
    val a: Double,
    val b: Double,
    val c: Double
) :Shape("Triangle") {
    init{
        println("$name is created with a = $a, b = $b and c = $c")
        println("$name area is ${area()}")
        println("$name perimeter is ${perimeter()}")
    }

    override fun perimeter() = a + b + c

    override fun area() = sqrt((perimeter() / 2) * (perimeter() / 2 - a) * (perimeter() / 2 - b) * (perimeter() / 2 - c))


}