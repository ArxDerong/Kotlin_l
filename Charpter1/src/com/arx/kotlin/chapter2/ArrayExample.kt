package com.arx.kotlin.chapter2

import com.sun.xml.internal.fastinfoset.util.StringArray

/**
 * Created by Arx on 2017/7/14.
 * derong218@qq.com
 */
fun main(args: Array<String>) {
    val arrayOfInt:IntArray = intArrayOf(1,3,4)
    val arrayOfChar:CharArray = charArrayOf('a','b','c')
    val arrayOfString:Array<String> = arrayOf("a","b","c","c")
    println(arrayOfInt.size)
    for (i in arrayOfInt) {
        print(i)
    }
    println()
    println(arrayOfChar.joinToString("-"))
    val slice = arrayOfString.slice(1..3)
    println(slice.javaClass.simpleName)

}