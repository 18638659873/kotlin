package com.yc.chapterV

abstract class MyLife {

    fun live() {
        study()
        love()
        die()
    }

    abstract fun die()

    abstract fun love()

    abstract fun study()

}

class ChongLife : MyLife() {
    override fun die() {
        println("this is my last day")
    }

    override fun love() {
        println("where is my lover?")
    }

    override fun study() {
        println("I study erverday")
    }


}

fun main() {
    ChongLife().live()

}