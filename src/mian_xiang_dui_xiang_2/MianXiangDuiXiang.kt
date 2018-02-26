package mian_xiang_dui_xiang_2

/**
 * Created by hming on 2018/2/23.
 */
//矩形  长   宽
class Rect(var long:Int, var width:Int)

//妹子  长相特征    声音
class Girl(var chactor:String, var voice:String)

fun main(args: Array<String>) {
    var rect01 = Rect(20, 10)
    println("矩形的长度：${rect01.long}")
    println("矩形的宽度：${rect01.width}")

    var girl1 = Girl("彪悍", "甜美")
    println("girl1这个妹子的长相：${girl1.chactor}")
    println("girl1这个妹子的声音：${girl1.voice}")

}