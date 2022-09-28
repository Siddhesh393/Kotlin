// This program tells about variables in Kotlin.
fun main() {

    // This is how a variable is initialized in Kotlin.

    // There are keywords such as var, val,
    // var is used to assign value to variable.
    // val is used to assign value only once in the code, will show error if tried to define again.

    var myVariable : Int = 5
    println("\nThe value of myVariable now is: $myVariable")
    myVariable = 10
    println("After change: $myVariable\n")

    // There is no need of specifying the datatype.

    var myVariable1 = 10

    // $ sign is used to show the value in "".

    println("The value of variable is: myVariable1")
    println("The value of variable is: $myVariable1\n")

    // There are Int, Boolean datatype.

    var myFlag : Boolean = true

    println("The value o myFlag before change: $myFlag")
    myFlag = false
    println("After change: $myFlag")
}