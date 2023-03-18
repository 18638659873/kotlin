package com.yc.chapterV

// 打印传入的类型结果
class FanXingShow<T>(private val obj: T) {
    fun show() = println("当前类型为：$obj")
}

data class Student(val name: String, val age: Int)
data class Dog(val name: String)

fun main() {
    val student = Student("zhangsan", 12)
    val dog = Dog("lele")
    FanXingShow(student).show()
    FanXingShow(dog).show()
}