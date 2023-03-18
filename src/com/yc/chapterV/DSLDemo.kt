package com.yc.chapterV

//DSL 简介： 所谓的DSL编程范式，定义输入和输出等规则：


class DSLContext {
    val info: String = "Information"
    val name: String = "chong"
    fun test(str: String) = println("Context test: $str")
}

// 定义了DSLContext类 才可以受用mApply，并且始终都是返回DSLContext本身
inline fun DSLContext.mApply(lambda: DSLContext.(String) -> Unit): DSLContext {
    lambda(info)
    return this
}

fun main() {
    DSLContext().mApply {
        test("OK")
        test(it)
        test(name)
    }
}