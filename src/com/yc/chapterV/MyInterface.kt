package com.yc.chapterV

interface JDBCInnect {
    var url: String
    val username: String
    val password: String
    fun connection()
}

class Mysql(override val username: String, override val password: String, override var url: String) : JDBCInnect {
    override fun connection() {
        println("mysql connection success ${username} ,${url}")
    }

}

fun main() {
    val mysql = Mysql("root", "123", "jdbc://mysql:xxx")
    mysql.connection()
}