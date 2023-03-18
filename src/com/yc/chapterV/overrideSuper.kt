package com.yc.chapterV

// Kt中，所有的类都是继承了Any 相当于Java中的Object的作用是一样的
// 主要是父子类时候  重写和重载的显示
// 在KT中 定义的class默认是被public final修饰的，需要使用open打开
open class Person(private val name: String) {
    private fun showName() = "Super Name: ${name}"

    //KT中所有的函数也是被final修饰的，不能被重写，需要使用关键字open打开
    open fun myPrintln() = println(showName())

}

class Sub(private val subName: String) : Person(subName) {

    private fun showName() = "Sub name:${subName}"

    override fun myPrintln() {
        println(showName())
    }

}

fun main() {
    val person: Person = Sub("chong")
    person.myPrintln()

    println(person is Person)
    println(person is Sub)
}