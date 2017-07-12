package com.arx.kotlin.chapter2

/**
 * Created by Arx888 on 2017/7/12.
 * derong218@qq.com
 */
class 美眉(性格:String, 长相:String, 声音:String):人(性格, 长相, 声音)
class 帅哥(性格:String, 长相:String, 声音:String):人(性格, 长相, 声音)

open class 人(性格:String, 长相:String, 声音:String){
    init{
        println("新建了一个${this.javaClass.simpleName}:性格$性格,长相$长相,声音$声音")
    }
}

fun main(args: Array<String>) {
    var 一个美眉:美眉 = 美眉("温柔","b","动人")
    var 一个帅哥:帅哥 = 帅哥("温柔","b","动人")
    println(一个帅哥 is 人)
}