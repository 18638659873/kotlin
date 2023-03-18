package com.yc.chapterVI


//定义一个类，用来存储需要转化数据，并传递使用
class RXJavaObject<T>(var itemVal: T) {


}

// 使用内联函数，把传入的数据，封装在RXObject对象中
inline fun <I> create(action: () -> I) = RXJavaObject(action())

// 将传入的数据类型，通过匿名函数转化成指定类型，并返回
inline fun <I, O> RXJavaObject<I>.map(mapAction: I.() -> O) = RXJavaObject(mapAction(itemVal))

fun main() {
    val ss = create {
        "chong"
    }.map {
        // 返回一个修改后的字符串，但是会被下面的覆盖掉
        "transform:$this"
        // 返回这个字符串的长度，为Int类型
        this.length
    }

    println(ss.itemVal)
}