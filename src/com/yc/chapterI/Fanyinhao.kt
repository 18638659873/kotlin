package com.yc.chapterI

private fun `登录测试函数 测试人：chong`(userName: String, pwd: Int) {
    println("登录人：$userName 密码：$pwd")
}

/**
 * 反引号的使用方法
 */
fun main() {
    // 第一种： 作为一个测试名字直接使用
    `登录测试函数 测试人：chong`("chong", 123456)

    // 第二种： 调用其他kt类的函数名，但是他是Kotlin的关键字时候 is in 就是关键字
//    KtTest.`in`()
//    KtTest.`is`()
}