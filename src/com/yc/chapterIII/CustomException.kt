package com.yc.chapterIII


import java.lang.Exception
import java.lang.IllegalArgumentException


fun main() {
    try {
        var info: String? = null
        CheckException(info)
        println(info!!.length)
    } catch (e: Exception) {
        e.printStackTrace()
    }

}

fun CheckException(info: String?) {
    info ?: throw CustomerException()
}


class CustomerException : IllegalArgumentException("params error")