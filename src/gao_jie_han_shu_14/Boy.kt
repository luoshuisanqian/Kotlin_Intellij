package gao_jie_han_shu_14

import java.util.*

/**
 * Created by hming on 2018/2/24.
 */
fun main(args: Array<String>) {
    var maxAge = 0;
     for (girl in girls) {
         if (girl.age > maxAge) {
             maxAge = girl.age
         }
     }

    println("年龄最大的妹子：${maxAge}")

    for (girl in girls) {
        if (girl.age == maxAge) {
            println(girl)
        }
    }


    /**
     * kotlin 打印集合
     * **/
    var list1 = girls.maxBy { it.age }//获取年龄最大的集合
    println("kotlin方式打印集合：${list1}")


    var list2 = girls.minBy { it.age } //年龄最小的集合
    println("kotlin方式获取年龄最小的集合："+"${list2}")


    /**
     * kotlin  过滤
     * **/
    var list3 = girls.filter {
        (it.age > 22) and (it.height > 165)
    }

    println("kotlin过滤：${list3}")


    /**
     * map方法
     */
    var list4 = girls.map {
        "${it.name} : ${it.age}"  // 姓名为key, 年龄为value
    }

    println("一个新的map集合：${list4}" )  //一个新的map集合：

    /**
     * count 满足条件的数量
     */
    var count1 = girls.count {// 打印1
        it.age < 22
    }

    /**
     * find 查找第一个符合条件的妹子，并返回一个集合
     */
    var find1_list = girls.find {
        it.address=="江西"
    }

    println("第一个符合条件的妹子：${find1_list}")  //第一个符合条件的妹子：Girl(name=张三, age=21, height=165, address=江西)



    /**
     * groupBy 按某个类型进行分组
     */
    var result = girls.groupBy {
        it.address
    }

   result.get("江西")?.forEach { println(it) }//把result分组后的结果进行筛选


}
