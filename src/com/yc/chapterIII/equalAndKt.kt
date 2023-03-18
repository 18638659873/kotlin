package com.yc.chapterIII

fun main() {
    val name1 = "chong"
    val name2 = "chong"
    // 这两种判断方式是一致的
    println(name1 == name2)
    println(name1.equals(name2))

    val name3 = "chong".capitalize()
    println(name1 == name3)
    println(name1 === name3)

    val str = "ABCDEFGHIJKLMN"
    str.forEach {
        print("循环当前的字符是: $it")
    }
}