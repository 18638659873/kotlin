package com.yc.chapterIV


fun main() {
    testMap2()
}


fun testMap() {
    val mapOf = mapOf("name" to "chong", "age" to "30")
    println(mapOf["name"])
    println(mapOf["hehe"])
    println(mapOf.getOrDefault("chong", "yu"))
    println(mapOf)
}

fun testMap2() {
    val map = mapOf("garden" to "male", Pair("name", "chong"), Pair("age", "18"))

    map.forEach {
        println("K: ${it.key},V:${it.value}")
    }

    for (entry in map) {
        println("entry: ${entry}")
    }

    map.forEach { (k, v) ->
        println("k:$k")
    }


}