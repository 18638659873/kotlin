package com.yc.chapterIII

fun main() {
    val str = "Hello World!"
    // run 匿名函数，也是持有一个this 指向 被调用的自己本身
    val msg = str.run {
        if (length > 5) true else false
    }.run {
        if (this) "success" else "error"
    }
    println(msg)

    //run函数的第二种使用方式
    println(str.run(::checkStr).run(::showMeg))

}

fun checkStr(value: String) = if (value.length > 5) true else false

fun showMeg(flag: Boolean) = if (flag) "success" else "error"