/*
* @author Siddhesh Salve
* @since 18 Aug, 2022
*  */

fun main(){
    var y = 3

    while(y > 0) {
        println("hello")
        y--
    }

    println("whats up?")

    val myArray = arrayOf("Hello","guys","whats up?")
    val  arrayLength = myArray.size

    var b = 0

    while(b < arrayLength) {
        println(myArray[b])
        b++
    }

    println("Please enter a number")
    var a = readLine()?.toInt()

    println("Lets count from $a down to 0: ")

    if(a != null) {
        while (a >= 0) {
            println(a)
            a--
        }
    }

    println("Enter number 1:")
    val int1 = readLine()?.toInt()

    println("Enter number 2:")
    var int2 = readLine()?.toInt()

    var x = 1
    var i = 0
    while(int1 != null && int2 != null  && i<int2) {
            x *= int1
            i++
    }
    println("$int1 to the power of $int2 is $x.")
}


