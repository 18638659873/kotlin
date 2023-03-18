package com.yc.chapterIII

fun main() {
    val str = "This is a String template for string function"

    // 字符串截取
    println(str.substring(0, str.indexOf('o')))
    println(str.substring(0 until str.indexOf('c')))

    //字符串分割
    val jsonTest = "Tom,Jerry,Rose,Tonny"
    val spList = jsonTest.split(",")
    println(spList)
    val (v1, v2, v3, v4) = spList
    println("v1: ${v1},v2:${v2}")


}