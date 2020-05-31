package com.example.myapplication

fun main() {
    var name = "Yan Puty"
    var isAwesome = true
    isAwesome = false
    println("this is " +name+ " is awesome " + isAwesome)
    var fullName: String
    fullName = "Dexter X$isAwesome"
    println(fullName)

    lambdaFunction ("asd") { valueA, valueB ->
        val sum = valueA + valueB
        println("The sum is: $sum")
    }
}

fun lambdaFunction (asd: String, completion: (valueA: Int, valueB: Int) -> Unit) {
    completion(2 ,3)
}
