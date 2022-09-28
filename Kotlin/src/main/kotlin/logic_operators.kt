fun main(){
    val x = 5
    val y = 5

    // == is used to compare between two variables whether they are equal in magnitude.

    println(x == y)

    // <,>,<=,>= has the same use as used in mathematics.

    println(x < y)
    println(x > y)

    // != denotes not equal.

    val a = 6
    val b = 10

    // || is or, && is and, ! is used for not.

    println(x == y && a == b)
    println(x == y || a == b)
    println(x == y && !(a == b))

    val x1 = 3
    val x2 = 4

    val simpleExpression = x1 > x2 || x2 > x1 && x2 <= x2
    println(simpleExpression)

    val bool = true
    val p = 9
    val q = 3
    val r = 9

    val hardExpression = !(p != r) && bool || r >(p + q) && (!bool || q < r)
    println(hardExpression)
}