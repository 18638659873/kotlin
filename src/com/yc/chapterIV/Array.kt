package com.yc.chapterIV

import java.io.File


fun main() {
    testArray()
}

fun testArray() {
    val arrayOf = intArrayOf(5, 1, 3, 5, 6, 8)
    println(arrayOf[1])
    println(arrayOf.elementAtOrNull(99))
}

fun testArray2() {

    val file = arrayOf(File("D://workspace"))
}