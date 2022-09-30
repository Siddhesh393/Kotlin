/*
* @author Siddhesh Salve
* @since 28 Sept,2022
* */



fun main(){
    val  myRect = Rectangle(5.0, 7.0)

    val x: Int = 1
    val y: Int = 5
    println(x.plus(y))

    println("Rectangle area is ${myRect.area()}")
    println("Rectangle perimeter is ${myRect.perimeter()}")
    println("Is rectangle is square? ${myRect.isSquare()}")

    val myCircle = Circle(5.0)
    val myCircle2 = Circle(7.0)

    val myTriangle = Triangle(2.0,4.0,5.0)

    val myCircle1 = Circle(8.0)
    myCircle1.changeName("Peter")


//    println(myCircle1.name)
//    The above code cannot be executed as .name is protected.


    val myCar = Car("Tata","Nano","HatchBack")

/* We can make constructor private by typing "private constructor"
*  before starting the constructor.
*/

    val rect = Rectangle(5.0)
    val circle = Circle (3.0)
    val triangle = Triangle(7.0,7.0,7.0)
    val maxAreaRectAndCircle = maxArea(rect, circle)
    val maxAreaRectCircleTriangle = maxArea(rect, circle, triangle)

    println("The maximum area of the rectangle and the circle is $maxAreaRectAndCircle")
    println("The maximum area of the rectangle, the circle and the triangle is $maxAreaRectCircleTriangle")

//    object is used for single instances, like to declare constants.

    // Companion object is like an object used in classes. This doesn't need an instance to call a function.
    val circle1 = Circle.randomCircle()

    val rectangle1 = Rectangle.randomRectangle()
}

fun maxArea(shape1: Shape, shape2: Shape): Double{
    val areaShape1 = shape1.area()
    val areaShape2 = shape2.area()

    return if(areaShape1 > areaShape2) areaShape1 else areaShape2
}

fun maxArea (shape1: Shape, shape2: Shape, shape3: Shape) : Double{
    val maxAreaShape1Shape2 = maxArea(shape1 , shape2)
    val areaShape3 = shape3.area()

    return if (maxAreaShape1Shape2 > areaShape3) maxAreaShape1Shape2 else areaShape3
}

