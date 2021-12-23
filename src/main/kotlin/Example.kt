package com.develogical.web

fun printSomething(): String = "Hello World Another Time"

fun addNumbers(query: String): String {
      val elements = query.split(" ")
    val result = elements[3].toInt() + elements[5].toInt()
    return result.toString()
}

fun largestNumber(query: String): String {
    val max =  query.split(":")[2].split(", ").map{it.trim().toInt()}.maxOrNull() ?: 0
    return max.toString()
}

fun multiply(query: String): String {
    val numbers =  query.split(" ")
    val result = numbers[3].toInt() * numbers[6].toInt()
    return result.toString()
}
