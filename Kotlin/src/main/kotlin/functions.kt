import kotlin.math.exp

/*
* @author Siddhesh Salve
* @since 21 Aug,2022
*/

fun main() {
//    printThreeLines()
//
//    val pow = printPow(3,5)
//
//    println("3 to the power of 5 is $pow")
//
//    printSum(1,5)
//    println(multiply(3,5))

    val list = listOf(3,2,5,1,4,6,7)

    println("The list looks like the following: $list")
    println("Search for this number:")
    val input = readLine()?.toInt()
    if(input != null){
        println("The index of $input is ${searchItem(list,input)}")
    }

}

fun printPow(base: Int, exponent: Int): Int {
    var result = 1
    for(i in 1..exponent){
        result *= base
    }
    return result
}

fun printThreeLines() {

    println("first")
    println("second")
    println("third")
}

fun printSum(first: Int, second: Int){
    var ans = 0
    for(i in first..second){
        ans += i
    }
    println("The sum of the values from $first to $second is $ans")
}

fun multiply (a: Int, b: Int) = a * b

fun searchItem(list: List<Int>, value: Int): Int {

    for (i in 0..list.size - 1) {
        if (list[i] == value) {
            return i
        }
    }
    return -1
}