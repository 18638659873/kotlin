package com.yc.chapterI


/**
 *  range函数
 */
fun range(num: Int) {
    if (num in 0..59) {
        println("不及格")
    } else if (num in 60..89) {
        println("良好")
    } else if (num in 90..100) {
        println("优秀")
    } else {
        println("无效")
    }
}

/**
 * when 函数 kotlin的返回是Unit类型，void会封装成Unit的
 */
fun userWhen(num: Int) {
    val week = when (num) {
        1 -> "星期一"
        2 -> "星期二"
        3 -> "星期三"
        4 -> "星期四"
        5 -> "星期五"
        6 -> "星期六"
        7 -> "星期日"
        else -> {
            println("无效")
        }
    }
}


fun main() {
    var num = 1
    println(userWhen(num))

}

