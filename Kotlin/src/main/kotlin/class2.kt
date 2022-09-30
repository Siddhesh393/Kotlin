/*
* @author Siddhesh Salve
* @since 30 Sept,2022
*/

fun main() {

    val a = 3.0
    val b = 4.0
    val height = 2.0

    val parallelogram = object : Shape("Parallelogram", a,b,height) {

        init {
            println("Parallelogram created with a = $a, b = $b and height = $height")
            println("The area is ${area()}")
            println("The perimeter is ${perimeter()}")
        }

        override fun perimeter(): Double {
            return a * height
        }

        override fun area(): Double {
            return 2*a + 2*b
        }

        fun isRectangle() : Boolean = height == b
    }

    println("Is the parallelogram a rectangle? ${parallelogram.isRectangle()}")

    val x = 4.0
    val y = 8.0
    val h = 5.0
    val w = 3.0
    val z = 4.0
    val trapezium = object : Shape ("Trapezium",x,y,h,w,z) {

        init{
            println("Trapezium is created with x = $x, y = $y, h = $h, w = $w and z = $z")
            println("The area is ${area()}")
            println("The perimeter is ${perimeter()}")
        }

        override fun perimeter(): Double {
            return x + y + w + z
        }

        override fun area(): Double {
            return (x + y)/2 * h
        }
    }
}