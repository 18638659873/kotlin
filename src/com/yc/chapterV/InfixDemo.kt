package com.yc.chapterV


// 学习中缀表达式，可以简化代码开发
// 关键字 infix <使用类型一，被使用类型二> 表达式名称(被使用类型二作为参数) 具体要实现的内容
private infix fun <T, R> T.say(r: R) {
    println("self:$this, param: $r")
}

fun main() {
    // Kt中的中缀表达式有 map
    val mapOf = mapOf("key" to "123")
    println(mapOf)

    // 使用中缀表达式的方式一
    "chong".say("yu")
    // 简洁方式使用二
    "chong" say "yu"

}