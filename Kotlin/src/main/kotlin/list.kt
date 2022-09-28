/*
* @author Siddhesh Salve
* @since 19 Aug,2022
*/

fun main(){
    val array = arrayOf(1,2,3)
    // val list = listOf(1,2,3)

    array[0] = 3

    // list[0] = 3 we cannot change value in a list. To change for changing values use mutableListOf().

    val list = mutableListOf(1,2,3)

    // In a mutable list we can change the size of list, add and delete elements.
    // Mutable list is a collection.

    list.add(4)
    list.remove(2)

    // .removeAt() to remove an element on the basis of index.

    // Mutable list can be printed in the form [1,2,3,4].

    // These extra methods are not available for arrays.

    println(list)

    val list1 = mutableListOf<Int>()

    println("Enter the 5 numbers:")

    for(i in 1..5){
        val x = readLine()?.toInt()
        if(x != null)
            list1.add(x)
    }

    println("The 5 numbers in reverse order are: ")

    var i = 4

    for(q in list1.size - 1 downTo 0){
        println(list1[q])
    }
    while(i>=0){
        println(list1[i])
        i--
    }

    println("Enter a number n > 1: ")


//    var j = 1
//    var a = 0
//    var b = 1
//    var c = 0
//    var fibo = mutableListOf<Int>()
//
//    if(n != null){
//        for(j in  1..n){
//            if(j==1){
//                fibo.add(a)
//                continue
//            }
//            else if(j==2){
//                fibo.add(b)
//                continue
//            }
//            c = a+b
//            a=b
//            b=c
//            fibo.add(c)
//        }
//    }
    val fibo = mutableListOf(0, 1)
    var n = readLine()?.toInt()

    if(n != null){
        for(t in 2 until n - 1){
            fibo.add(fibo[t-2] + fibo[t-1])
        }
    }
    println(fibo)
 
}