fun main(){
    val x = 5
    val y = 7

    if(x < y){
        println("x if lesser than y.")
    }
    else if (x > y){
        println("x is greater than y.")
    }
    else{
        println("x is equal to y.")
    }

    val string = "racecar"
    println("The string is $string")
    if(string == string.reversed()){
        println("The string $string is a palindrome.")
    }
    else{
        println("The string $string is not a palindrome.")
    }
}