/*
* @author Siddhesh Salve
* @since 21 Aug,2022
*/

fun main(){
    val array = intArrayOf(10,20,25)

    // We can also add arrays in vararg by adding *before the array name.

    val max = getMax(1,2,3,4,5,6,21,13,*array)
    println("The maximum is $max")

    searchFor("How to become a good programmer")
    searchFor("How to become the best Kotlin programmer", "Bing")

    val sum = alternatingSum(3,4,5,2,1,2,3)
    println("The alternating sum is $sum")

}

// vararg numbers: is similar to list: List<Int>
// If we had used the second parameter then we had to add a list in the parameter while calling the function.

fun getMax(vararg numbers: Int): Int{
    var max = numbers[0]
    for(number in numbers){
        if(number > max){
            max = number
        }
    }
    return max
}

// Here searchEngine is default value. If no value is entered the function will use default value and
// if a value is entered it will use that value.

fun searchFor(search: String, searchEngine: String = "Google") {
    println("Searching for '$search' on $searchEngine")
}

fun alternatingSum(vararg numbers: Int) : Int{
    var sum = 0
    for(i in 0..numbers.size - 1){
        if(i%2!=0){
            sum-=numbers[i]
        } else{
            sum+=numbers[i]
        }
    }
    return sum
}