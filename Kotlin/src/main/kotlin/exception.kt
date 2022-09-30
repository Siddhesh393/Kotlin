/*
* @author Siddhesh Salve
* @since 30 Sept,2022
*/

import java.lang.NumberFormatException

// Exception Handling

fun main(){

    val division = try {
        divide(5.0,0.0)
    } catch(e: DivisionByZeroException) {
        0.0
    }

    println("The result of the division is $division")

//    println(divide(5.0,0.0))

    print("Please enter a number: ")

    val input = try {
        readLine()?.toInt()
    } catch(e: NumberFormatException) {
        0
    } finally {
        println("This is from the finally block")
    }

    println("You entered: $input")

    val myCircle = Circle(-5.0)

}

class DivisionByZeroException : Exception("You cannot divide by zero. Please choose another number")

fun divide(a: Double, b: Double) : Double{
    if(b == 0.0){
        throw DivisionByZeroException()
    }
    return a / b
}