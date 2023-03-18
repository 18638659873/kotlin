package com.yc.chapterIII

fun main() {
    // todo 第一种情况 默认是不可以为null的
    var name: String = "chong"
    // 不能赋值为null
    // name = null
    // 声明时指定为null 使用？可以赋值为null
    var names: String?
    names = null
    names = "chong"

    // 这个name2 可能为null 所以使用capitalize时 要指定补救措施，如果为null 需要怎么处理 ？就是一个补救措施
    var name2: String? = "chong"
    val capitalize = name2?.capitalize()
    println(capitalize)

    // 为null + let 使用 样例
    var name3: String? = null
    name3?.let {
        if (it.isBlank()) {
            "Default"
        } else {
            it
        }
    }

    // name3!!capitalize()  一定会执行

}
