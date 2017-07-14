package com.arx.kotlin.chapter2

/**
 * Created by Arx on 2017/7/13.
 * derong218@qq.com
 */
fun main(args: Array<String>) {
    var range:IntRange = 0..1024 //[0,1024]
    var rangeExclusive:IntRange = 0 until 1024   //[0,1024)
    var emptyRange:IntRange = 0..-1
    println("[0,1024]")
    for (i in range){
        print("$i,")
    }
    println("[0,1024)")
    for (i in rangeExclusive){
        print("$i,")
    }
    println()
    println(emptyRange.isEmpty())

    println(1023 in range)
    println(1024 in rangeExclusive)
}
