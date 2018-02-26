package jingtaishuxing_dongtaixingwei_3

/**
 * Created by hming on 2018/2/23.
 * 静态属性，动态行为(方法)
 */
//妹子  长相   声音
class Girl(var chactor:String, var voice:String) {
    //在大括号里面给妹子赋予形为
    fun smaile() {
        println("笑了一下")
    }

    fun cry() {
        println("呜呜呜，哭了")
        println("")
    }
}

fun main(args: Array<String>) {
    var girl1 = Girl("彪悍", "甜美")
    println("girl1的声音是：${girl1.voice}")
    girl1.cry()
    girl1.smaile()
}