package com.yc.chapterI

fun main() {
    val local = "不老山"
    val day = 2
    println("天气很好，在${local}玩了$day 天")

    val isLogin = true
    println("登录状态为：${if (isLogin) "登录成功" else "登录失败"}")
}