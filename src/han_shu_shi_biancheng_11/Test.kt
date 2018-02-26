package han_shu_shi_biancheng_11

/**
 * Created by hming on 2018/2/24.
 */

//(String) -> Unit 函数类型， 参数为字符串，返回值是Unit
var print = fun (name:String) : Unit {
    println(name)
}

fun main(args: Array<String>) {
    var names = listOf<String>("tom", "jerry", "lucy")

    names.forEach(print)// tom jerry lucy

    //第二种写法
    names.forEach {
        a -> println(a)//接收参数a   把a打印出来
    }
}
