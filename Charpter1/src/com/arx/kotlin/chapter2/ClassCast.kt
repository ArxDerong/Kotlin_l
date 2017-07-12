package com.arx.kotlin.chapter2

/**
 * Created by Arx on 2017/7/12.
 * derong218@qq.com
 */
fun main(args: Array<String>) {
    //var parent:Parent  = Parent()
    var parent:Parent  = Child()
    var child:Child? = parent as? Child

    println(child)
    println(child?.name)


}