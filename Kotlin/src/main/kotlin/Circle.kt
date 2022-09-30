/*
* @author Siddhesh Salve
* @since 28 Sept,2022
* */

import kotlin.random.Random

class Circle (
    val radius: Double
) : Shape("Circle"){

    companion object{
        fun randomCircle(): Circle{
            val radius = Random.nextDouble(1.0,10.0)
            return Circle(radius)
        }
    }

    init{
        if(radius < 0){
            throw NegativeRadiusException()
        }
        println("$name created with radius = $radius")
        println("$name area is ${area()}")
        println("$name perimeter is ${perimeter()}")
    }

    override fun area() = radius * radius * ImportantNumbers.PI

    override fun perimeter() = 2 * radius * ImportantNumbers.PI
}

class NegativeRadiusException : Exception("You cannot create a circle with negative radius.")