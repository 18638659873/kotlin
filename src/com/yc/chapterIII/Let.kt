package com.yc.chapterIII

fun main() {
    val list = listOf(1, 2, 3, 4, 5, 6)
    val v1 = list.first();
    println(v1 + v1)

    //let 匿名函数，内部肯定有一个it 指向自己本身，而且会把最后一行返回
    val sum = listOf(1, 2, 3, 4, 5, 6).let {
        it.first() + it.first()
    }
    println(sum)


}

//定义一个普通函数
fun getStrNormal(value: String?): String {
    return if (value == null) "参数为空" else "回显参数: ${value}"
}

//简写形式
fun getStrEa(value: String?) = if (value == null) "参数为空" else "回显参数: ${value}"

//使用let形式
fun getStrByLet(value: String?): String {
    return value?.let {
        "回显参数：$it"
    } ?: "参数为空"
}
