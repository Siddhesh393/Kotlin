/*
* @author Siddhesh Salve
* @since 20 Aug,2022
*/

fun main(){
//    println("Enter your age: ")
//    val age = readLine()?.toInt()
//    println()
//    if(age in 0..5){
//        println("You are a young kid")
//    } else if(age in 6..17){
//        println("You are a teenager")
//    } else if(age == 18){
//        println("Finally, you are 18!")
//    } else if(age == 19 || age == 20){
//        println("You are a young adult")
//    } else if(age in 21..65){
//        println("You are an adult")
//    } else{
//        println("You are really old")
//    }
//
//    when(age){
//        in 0..5 -> println("You are a young kid")
//        in 6..17-> println("You are a teenager")
//        18 -> println("Finally, you are 18!")
//        19,20 -> println("You are a young adult")
//        in 21..65 -> println("You are an adult")
//        else -> println("You are really old")
//    }

    // The above both codes run the same way. We can also enter string as a parameter in when condition.

    // The when condition can only take one parameter whereas if condition can take as many as parameters.
    // if( a==1 && b ==2) but we cannot do that in when.
    // Have to add {} for more lines of code.

    println("Where are you from ? ")
    var greeting = readLine()

    when(greeting){
        "India" ->println("Namaste")
        "Russia" -> println("Privet")
        "USA" -> println("Hello")
        "Germany" -> println("Hallo")
        else -> println("I don't know that")
    }
}