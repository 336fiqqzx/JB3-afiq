package com.example.gamejankenafiq

import kotlin.random.Random

object game {
    private val rules = mapOf(
        "ROCK-SCISSORS" to true,
        "ROCK-PAPER" to false,
        "SCISSORS-PAPER" to true,
        "SCISSORS-ROCK" to false,
        "PAPER-ROCK" to true,
        "PAPER-SCISSORS" to false,
    )
    private val options = listOf("ROCK,PAPER,SCISSORS")
    private val optionDrawable= mapOf(
        "ROCK" to R.drawable.batu,
        "SCISSORS" to R.drawable.gunting,
        "PAPER" to R.drawable.kertas,
    )
    fun pickRandomOption(): String = options[Random.nextInt(from = 0, until = 3)]
    fun pickDrawable(option: String): Int = optionDrawable[option]!!
    fun isDraw(from: String, to: String): Boolean = from == to
    fun isWin(from: String,to: String): Boolean = rules["$from-$to"]!!
}