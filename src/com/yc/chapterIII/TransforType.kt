package com.yc.chapterIII

import kotlin.math.roundToInt

// 字符串转换其他类型
fun main() {
    val numb = "888".toInt()
    val numb2: Int? = "888.8".toIntOrNull()
    println(555.5.toInt())
    println(555.5.roundToInt())


}