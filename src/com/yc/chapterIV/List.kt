package com.yc.chapterIV

fun main() {
    testListAssignment()
}

// list 的基本使用 不可变集合  不能增加元素和修改元素
fun testList1() {
    val list = listOf<String>("chong", "yu")
    println(list[0])
    println(list.get(1))
    println(list.getOrElse(2) { "no value" })
    println(list.getOrNull(3))
}

// list 可变list ，可以修改list
fun testList2() {
    val list = mutableListOf<String>("chong", "yu")
    list.add("ya")
    list += "ran"
    list.removeIf {
        if (it == "ran") true else false
    }
    println(list)
}

//遍历list集合
fun iteratList() {

    val listOf = listOf<Int>(3, 2, 3, 4, 8, 6, 7, 1, 2)
    // 直接获取元素
    for (i in listOf) {
        print(i)
    }
    listOf.forEach {
        println("ele:$it")
    }
    listOf.forEachIndexed { index, i ->
        println("index:$index , i : $i")
    }
}

// 使用list集合给变量赋值
fun testListAssignment() {
    val listOf = listOf<String>("chong", "yu")
    val (v1, v2) = listOf
    println(v1)

    //用_ 可以将前面的一个元素不赋值
    val (_, v3) = listOf
    println(v3)

}


