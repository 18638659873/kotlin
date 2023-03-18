package com.yc.chapterIII

fun main() {

    val str = "Hello World!"

    //with 使用匿名函数
    val len = with(str) {
        length
    }
    val msg = with(len) {
        "长度为：$this"
    }
    println(msg)


    //with 使用的具名函数
    println(with(with(str, ::getStrLen), ::getLenMsg))


}

fun getStrLen(str: String) = str.length
fun getLenMsg(len: Int) = "字符串长度为：${len}"