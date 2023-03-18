package com.yc.chapterV

// 传入多个泛型的参数
class VarargTest<T>(vararg objects: T, var isMap: Boolean = true) {

    // 使用objectArray 接收多个泛型的参数
    private val objectArray: Array<out T> = objects

    // 根据下标 返回某一个泛型
    fun showObj(idx: Int): T? = objectArray[idx].takeIf { isMap }

    // 使用运算符重载形式 返回下标的某个类型
    operator fun get(idx: Int): T? = objectArray[idx].takeIf { isMap }

    //mapAction函数传入的可能是T 或者是null 返回的是O的类型
    fun <O> mapObj(idx: Int, mapAction: (T?) -> O) = mapAction(objectArray[idx].takeIf { isMap })

}

fun main() {

    // 这里的泛型是传入了多个类型的，所以类型为：VarargTest<Comparable<*> & java.io.Serializable>
    // 当然也可以使用Any接收 也就是Java的Object
    val varargTest: VarargTest<Any> = VarargTest("666", 111, isMap = true)
    println(varargTest.showObj(0))
    println(varargTest.showObj(1))

    val a = varargTest.mapObj(0) {
        it.toString().toInt()
    }

    println(a is Int)

    //数组的运算符重载形式 获取下标的某一个元素
    println(varargTest[1])

}