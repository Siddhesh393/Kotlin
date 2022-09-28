/*
* @author Siddhesh Salve
* @since 18 Aug,2022
*/

fun main(){

    var myArray1 = arrayOf(1,2,3,4,5)

    for(i in myArray1){
        println(i)
    }

    // The following code will print the range.

    for(i in 4..6){
        println(i)
    }

    for(i in 20 downTo 7 step 3){
        println(i)
    }

    for(i in 'a'..'z'){
        println(i)
    }

    val myArray = arrayOf(4,2,3,5,7,6)
    var max = myArray[0]
    var sum = 0

    for(i in myArray) {
        if(i > max){
            max = i
        }
    }
    println("The max value in myArray is $max")

    for(i in myArray){
        sum += i
    }
    println("The sum of the array is $sum")

    var avg = 0.0

    println("Enter 5 numbers: ")

    for(i in 1..5){
        var input = readLine()?.toInt()
        if(input != null) {
            avg += input / 5.0
        }
    }

    println("The average value is $avg")
}