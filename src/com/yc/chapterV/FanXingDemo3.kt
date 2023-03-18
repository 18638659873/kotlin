package com.yc.chapterV


open class Object(name: String)

class Person2(name: String) : Object(name = name)

class Dog2(name: String) : Object(name = name)

// 这个泛型类 约束了传入的泛型 只能是继承了Object的 其他类 传入是会报错的
class ObjectShow<T : Object>(val inputType: T, val isMap: Boolean = true) {
    fun show() = inputType.takeIf { isMap }
}

fun main() {
    val obj = Object("obj")
    val dog = Dog2("lele")
    ObjectShow(dog).show()


}