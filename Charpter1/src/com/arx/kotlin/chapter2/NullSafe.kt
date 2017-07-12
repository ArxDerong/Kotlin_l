package com.arx.kotlin.chapter2

/**
 * Created by Arx on 2017/7/12.
 * derong218@qq.com
 */

fun getName():String{
    return "ABC"
}
fun getName2():String?{
    return null
    //return "BCD"
}


fun main(args: Array<String>) {
    println(getName2()?:return)
    println(getName())
}