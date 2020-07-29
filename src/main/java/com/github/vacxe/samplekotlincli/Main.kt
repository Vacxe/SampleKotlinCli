package com.github.vacxe.samplekotlincli

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    try {
        val firstAddend = args.get(index = 0).toInt()
        val secondAddend = args.get(index = 1).toInt()
        println("Sum of $firstAddend and $secondAddend equals ${firstAddend + secondAddend}")
    } catch (e: Exception){
        exitProcess(1)
    }
}