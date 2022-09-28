
fun main(){
    var x = 15
    val y = 7

    // + operator is used to add the variables or parameters adjacent to the operator.
    // Same for the - , * , /.

    val sum =  x + y
    val diff = x - y
    val mult = x * y
    val div = x / y
    println("\nThe addition, subtraction, multiplication, and division of variable x = $x and y = $y is $sum, $diff, $mult and $div resp.")

    // To use operation inside the println statement we have to use {}.

    println("\nThe result of x + y is : $x + y")
    println("The result of x + y is : ${x + y}")

    // The value of variable is changed.
    x = 10
    println("\nThe value of x is changed to: 10")
    println("\nThe result of x + y now is : ${x + y}")

    // += operator is used to add the entered value to the previously alloted value. This is similar to x = x + a
    // -= is used to subtract from previous values.

    x += 7
    println("\nThe result of x + y now is : ${x + y}")

    val a = 3
    val b = 4
    val c = 5
    println("\na: $a")
    println("a + b: ${a + b}")
    println("a + b + c: ${a + b + c}")

}