fun main(){
    // To use float datatype, have to add F after the data. Takes 32 bytes of memory .

    var x: Float = 20.15347F
    var y: Float = 8F

    println("The result is x / y is ${x/y}")

    // To use double values just add decimal values to the variable. Takes 64 bytes of memory.

    var a = 20.15347
    var b = 8

    println("The result is a / b is ${a/b}")

    // The double datatype produces more accurate value.

    var radius = 5.5
    var volCube = 0.75 * 3.14 * radius*radius*radius

    println("\nThe volume of the sphere with the radius $radius is $volCube.")
}
