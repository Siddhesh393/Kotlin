fun main() {

    // readLine is used to take input.

    val userInput = readLine()
    println("You entered $userInput")

    val input = readLine()

    // readLine can take null as an input. So to avoid error we use ? to check whether the input is not null.

    println(input?.toUpperCase())

    val input1 = readLine()

    // To check whether input is a null input.

    if (input1 != null) {
        println(input1.toInt() - 5)
    }
    println("Please enter your age :")
    val ageInput = readLine()?.toInt()

    // toInt is used here so that the input is integer.

    // To check what is your age?

    if (ageInput != null) {
        if(ageInput.toInt() in 18..60)
            println("You are an adult.")
        else if (ageInput.toInt() > 60)
            println("You are really old.")
        else
            println("Your not an adult yet.")
    }
}