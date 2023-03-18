package com.yc.chapterII

/**
 * count 就是一个匿名函数
 * 函数体中，可以指定需要统计的某一个字符作为他的统计值
 */
fun main() {
    val len = "chong".count()

    val len2 = "chong".count {
        it == 'c'
    }
    println(len2)
    //匿名函数 使用一 声明和函数体分开定义
    //第一步 声明函数
    val methodAction: () -> String
    //第二步 实现函数体
    methodAction = {
        "success"
    }
    //第三步  函数的使用
    println(methodAction())


    //匿名函数使用二 一次性定义完成
    val methodAction2: (Int, Int, String) -> String = { num1, num2, str ->
        "$num1,$num2,$str"
    }
    println(methodAction2(1, 2, "3"))

    //匿名函数使用三  匿名函数或者 普通函数而言，如果只有一个参数 可以直接使用it
    // String -------  it:String
    val methodAction3: (Int) -> String = {
        "$it"
    }

    //匿名函数使用四  不使用：  使用 = 可以不用定义返回值  类型推导
    // String -------  it:String
    val methodAction4 = { userName: String, age: Int ->
        "userName: ${userName},age: $age"
    }
}