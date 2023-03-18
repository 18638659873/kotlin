package com.yc.chapterV


open class SuperClass {

    open fun add(name: String) = println("Super class add ${name}")

}

class SubClass : SuperClass() {

    override fun add(subName: String) {
        println("Name Sub class add ${subName}")
    }

}

fun main() {
    //使用子类实现父类调用
    val sup: SuperClass = SubClass()
    sup.add("chong")

    //匿名内部类实现的
    val anonymous = object : SuperClass() {
        override fun add(name: String) {
            println("Anonymous Class: ${name}")
        }
    }
    anonymous.add("yu")



}