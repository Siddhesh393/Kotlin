/*
* @author Siddhesh Salve
* @since 28 Sept,2022
*/

import kotlin.random.Random

class Rectangle(
    val a: Double,
    val b: Double
) : Shape("Rectangle"){

    companion object{
        fun randomRectangle() : Rectangle{
            val a = Random.nextInt(1,10)
            val b = Random.nextInt(1,10)
            return Rectangle(a,b)
        }
    }

    constructor(a: Double) :this(a,a)

    constructor(a: Int, b:Int) : this(a.toDouble(), b.toDouble())
    init{
        println("$name created with a = $a and b = $b")
        println("$name area is ${area()}")
        println("$name perimeter is ${perimeter()}")
    }

    override fun area() = a * b

    override fun perimeter() = 2*a + 2*b

    fun isSquare() = a==b
}