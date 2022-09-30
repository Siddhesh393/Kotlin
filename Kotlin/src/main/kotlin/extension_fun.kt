/*
* @author Siddhesh Salve
* @since 30 Sept,2022
*/

fun main(){
    println("Please enter a number")
    val input = readLine()?.toInt()

    if(input != null){
        if(input.isPrime()){
            println("$input is a prime number.")
        }
        else{
            println("$input is not a prime number.")
        }
    }

    val list = listOf(1,2,3,4,5)
    val array = arrayOf(5,4,3,2,1)

    println("The product of $list is ${list.products()}")

    println("List: $list")
    printEle(list)

    println("Array: $array")
    printEle(array)
}

fun Int.isPrime(): Boolean {
    for(i in 2 until this - 1){
        if(this % i == 0)
            return false
    }
    return true
}

fun List<Int>.products(): Int {
    var result = 1
    for(value in this){
        result *= value
    }

    return result
}

fun printEle(list: List<Int>){
    var i = 0
    var j = list.size - 1
    var flag = true

    while(i<=j){
        if(flag){
            println(list[i])
            i++
        }
        else{
            println(list[j])
            j--
        }
        flag = !flag
    }
}

fun printEle(array: Array<Int>){
    var i = 0
    var j = array.size - 1
    var flag = true

    while(i<=j){
        if(flag){
            println(array[i])
            i++
        }
        else{
            println(array[j])
            j--
        }
        flag = !flag
    }
}