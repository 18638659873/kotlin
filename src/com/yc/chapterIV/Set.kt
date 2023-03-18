package com.yc.chapterIV

fun main() {
    testSet2()
}

// 集合 无重复数据,链表形式的集合 他是没有下标的，不能通过下标获取元素
// 也是不可变
fun testSet() {
    val setof = setOf<String>("chong", "yu", "CHONG", "yu")
    println(setof.elementAt(0))
    println(setof.elementAtOrNull(5))
}

// 可变set集合
fun testSet2() {
    val setof = mutableSetOf<String>("chong", "yu", "CHONG", "yu")
    setof += "ran"
    println(setof)

}