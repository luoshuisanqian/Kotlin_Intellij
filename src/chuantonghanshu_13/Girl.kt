package chuantonghanshu_13

import java.net.Inet4Address
import java.util.*

/**
 * Created by hming on 2018/2/24.
 */

data class  Girl(var name:String, var age:Int, var height:Int, var address:String)

var girls = listOf<Girl>(

        Girl("张三", 21, 165, "江西"),
        Girl("李四", 22, 170, "上海"),
        Girl("王五", 23, 175, "江西")
)

fun filterGirlAddrwss(address: String, age : Int) {//过滤妹子地址的方法

    var 符合某个地区的妹子 = ArrayList<Girl>()
    for (girl in girls) {
        if ((girl.address == address) and (girl.age == age)) {
            符合某个地区的妹子.add(girl)
        }
    }

    for (girl in 符合某个地区的妹子) {
        println("属于江西妹子姓名：${girl.name} 年龄：${girl.age}" )
    }
}
