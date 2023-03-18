package com.yc.chapterIII

fun main() {
    // 原始字符串
    val sourcePwd = "ABCDEFJHIJKLMNOPQRSTUVWXYZ"

    //替换后的新字符串
    val newPwd = sourcePwd.replace(Regex("[AKMNO]")) {
        when (it.value) {
            "A" -> "1"
            "K" -> "2"
            "M" -> "3"
            "N" -> "4"
            "O" -> "5"
            else -> it.value
        }
    }
    println("newPWd $newPwd")

    val decodePwd = newPwd.replace(Regex("[12345]")) {
        when (it.value) {
            "1" -> "A"
            "2" -> "K"
            "3" -> "M"
            "4" -> "N"
            "5" -> "0"
            else -> it.value
        }
    }
    println("decodePwd $decodePwd")
}