package com.yc.chapterV

import org.omg.CORBA.PRIVATE_MEMBER


// KT中 枚举的使用
enum class MyEnum {
    LIFE,
    WEALTH
}

class ProfessionAtt(val name: String, val salary: Int) {

    fun showAtt() = "$name, $salary"
}

enum class Profession(private val pro: ProfessionAtt) {
    TEACHER(ProfessionAtt("teacher", 10000)),
    WORKER(ProfessionAtt("worker", 1200));

    fun showInfo() = "Profession Info： ${pro.showAtt()}"
}

fun main() {
    println(MyEnum.LIFE)
    println(MyEnum.LIFE is MyEnum)
    println(Profession.TEACHER.showInfo())
}