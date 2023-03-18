package com.yc.chapterI

/**
 * Kotlin 函数定义
 *
 * 默认public fun 函数名    (参数名：参数类型 ,.. ) :返回类型
 * private fun funName(age: Int, name: String): String {}
 * 可以直接定义形参的默认值
 *
 * :Unit 可以返回void 有类型返回 就返回
 */

private fun funName(age: Int, name: String = "chang"): String {
    println("name: $name age: $age")
    return "success"
}

fun main() {
    // 可以直接打乱方法的参数顺序，指定传值
    funName(name = "zhansan", age = 12)
}