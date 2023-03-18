package com.yc.chapterIII

import sun.rmi.runtime.Log

fun main() {
    val str = "Hello World"

    testTakeIf(str, 'W')
    testTakeUnless(str, 'W')

}

fun testTakeIf(str: String, chr: Char) {
    str.indexOf(chr)
        .takeIf {
            println("testTakeIf: it = $it")
            it >= 0
        }
        ?.let {
            println("testTakeIf: has yan")
        }
    println("testTakeIf: $str")
}

fun testTakeUnless(str: String, chr: Char) {
    str.indexOf(chr)
        .takeUnless {
            println("testTakeUnless: it = $it")
            it < 0
        }
        ?.let {
            println("testTakeUnless: has yan")
        }
    println("testTakeUnless: $str")
}
