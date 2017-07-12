package com.arx.kotlin.chapter2

/**
 * Created by Arx888 on 2017/7/12.
 * derong218@qq.com
 */
class 美眉(var 性格:String,
          var 长相:String,
          var 声音:String){
    init{
        println("新建了一个美眉:性格$性格,长相$长相,声音$声音")
    }
}


fun main(args: Array<String>) {
    var 一个美眉:美眉 = 美眉("温柔","b","动人")
}