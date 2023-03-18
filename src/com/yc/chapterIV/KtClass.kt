package com.yc.chapterIV

class MinKtClass {
    var num: Int = 0
        // 下面的get set 方法可以不用写，默认就已经存在了
        get() = field
        set(value) {
            field = value
        }

    // 计算属性，get方法 返回的不是filed本身了，而是然会一个计算后的值
    var num2: Int = 0
        get() = (1..100).random()
}

class MinKtClass2(_name: String, _age: Int, _garden: Char, _info: String) {
    var name = _name
        get() = field
        // set方法指定为private时，就不能被再次赋值了。
        private set(value) {
            field = value
        }
    val garden = _garden
        get() = field
    // 这里不能有set方法了 因为变量被 val修饰 不能修改
    //set(value) ()

    var age: Int = _age
        get() = if (field < 0) 0 else field
        set(value) {
            field = value
        }

    val info = _info
}

// 和上面的逻辑是一样的，这个是简写方式
class MinKtClass3(var _name: String, val _age: Int, var _garden: Char, var _info: String) {

}

class ConstructClassMutiple(_name: String) {
    var name = _name

    init {
        println("hello")
    }

    constructor(name: String, age: Int) : this(name) {
        println("name:${name},age:${age}")
    }
}

fun main() {
    ConstructClassMutiple("chong", 12)

    val mutiple = ConstructClassMutiple("yu")
    println(mutiple.name)

}