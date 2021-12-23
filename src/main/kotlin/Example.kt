package com.develogical.web

fun printSomething(): String = "Hello World Another Time"

fun addNumbers(query: String): String {
      val elements = query.split(" ")
    val result = elements[2].toInt() + elements[4].toInt()
    return result.toString()
}
