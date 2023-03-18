package com.yc.chapterIII

fun main() {
    val info = "Hello World"
    println(info.length)
    println(info[info.length - 1])
    println(info.toLowerCase())

    // apply的使用方式， 主要就是使用他的链式调用，内部this就是字符串本身
    // apply 返回的是被调用对象的本身
    // apply 返回在内部处理后的本身数据
    val newInfo = info.apply {
        println("apply: ${length}")
    }.apply {
        println("apply: ${this[length - 1]}")

    }.apply {
        println("apply: ${toLowerCase()}")

    }

}