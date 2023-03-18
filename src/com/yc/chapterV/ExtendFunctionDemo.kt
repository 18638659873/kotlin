package com.yc.chapterV

// 定义一个已经写好的类
class ExtendFun(val name: String, val age: Int)


// 之后 对这个类，进行一些扩展
fun ExtendFun.show() {
    println("This is a Extend Function: ${this.name}")
}

// 对String 类 进行一些扩展函数
fun String.showString() = println(this)

// 还可以对一个类 进行扩展属性， 例如对String扩展
val String.myStr
    get() = "myStr $this"

fun main() {
    val extendFun = ExtendFun("chong", 22)
    extendFun.show()

    // 这个就是对String类的函数扩展，很好用
    "chong".myStr.showString()
}
