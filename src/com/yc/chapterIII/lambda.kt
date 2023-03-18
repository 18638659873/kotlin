package com.yc.chapterIII

fun main() {
    // 调用一个函数，然后返回一个lambda函数
    val showMethod = showMethod("123")
    println(showMethod("123", 12))
}


/**
 * 返回一个匿名函数
 */
fun showMethod(info: String): (String, Int) -> String {
    println("showMethod:info ${info}")
    return { str, num ->
        "lambda ${str},${num}"
    }
}