package com.yc.chapterV

//结构类，可以对变量进行赋值
class People(val name: String, val age: Int) {

    operator fun component1() = name
    operator fun component2() = age


}

fun main() {
    val (name, age) = People("chong", 12)
    println("name:$name , age:$age")
}