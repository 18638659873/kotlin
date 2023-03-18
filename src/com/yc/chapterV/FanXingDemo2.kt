package com.yc.chapterV


// 传入一个类型，根据是否需要转化 进行返回
class FanxingTransform<T>(val isMap: Boolean = false, val inputType: T) {
    inline fun <R> map(mapAction: (T) -> R) = mapAction(inputType).takeIf { isMap }
}

// 定义一个内联函数 进行类型转换
inline fun <T, R> map(inputType: T, isMap: Boolean = true, mapAction: (T) -> R) =
    if (isMap) mapAction(inputType) else null

fun main() {
    // 使用一个类，进行类型转化
    val transform = FanxingTransform(isMap = true, inputType = 12345)
    val a = transform.map {
        it.toString()
    }
    println(a is String)

    // 使用内联函数 进行转化
    val b = map("666") {
        it.toInt()
    }
    println(b is Int)
}