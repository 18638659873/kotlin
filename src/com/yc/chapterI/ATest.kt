package com.yc.chapterI

fun main() {
    println("hello world")
    /*
        todo    声明变量
        可读写  变量名  类型      值
        var    name : String = "chong"
     */
    var name: String = "chong"

    /*
        todo    常见类型，会转化成java的基本类型
        String  字符串
        Char    单字符
        Boolean 布尔
        Int     整形
        Double  浮点数
        Float   单精度
        List    集合
        Set     不重复集合
        Map     键值对
     */

    // todo 不可修改变量 使用val修饰，只读模式
    val info: String = "Information"

    // todo 类型推断 有一些变量不需要指定类型，根据后面的变量进行推断
    val age = 18

}

// todo 编译时常量
const val PI = 3.14
