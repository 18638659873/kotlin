package com.yc.chapterV


// 所有的泛型 默认是不变
// 只能输出，不能作为输入，也就是只能读取，不能修改
// 这个就是泛型的   协变  父类 = 子类
// ？extend 在Java中的使用
interface OutDemo<out T> {

    // 不能作为输入使用，会报错
    //fun inDemo(t: T)

    // 把这个类型，返回出去
    fun outDemo(): T

}

// 只能输入，不能作为输出，也就是只能修改，不能读取
// 这个就是泛型的   逆变  子类 = 父类
// ？super 在Java中的使用
interface InDemo<in T> {

    fun inDemo(t: T)

    // 这个不行，不能作为输出
    //fun outDemo(): T

}