package com.arx.kotlin.chapter2

/**
 * Created by Arx888 on 2017/7/12.
 * derong218@qq.com
 */
var aString: String = "abc"
var fromChar: String = String(charArrayOf('a', 'b', 'c'))
fun main(args: Array<String>) {
    println(aString == fromChar)//比较值
    println(aString === fromChar)//比较对象

    println("输出:" + aString)

    val arg1: Int = 1
    val arg2: Int = 2
    println("$arg1+$arg2=${arg1 + arg2}")


    var rawString:String = """
        abc
    """
    println(rawString)
}