package gao_jie_han_shu_14

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


