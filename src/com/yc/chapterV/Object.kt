package com.yc.chapterV

//object 修改的类 就是单例的，直接使用
object MyObject {
    init {
        println("MyObject init is start")
    }

    fun show() = println("MyObject is showing ")
}

fun main() {
    MyObject.show()
}