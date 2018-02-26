package chouxiang_jicheng_6

/**
 * Created by hming on 2018/2/24.
 */
fun main(args: Array<String>) {
    var person1 = Man(name = "金三胖")

    var person2 = WoMan(name = "慈禧太后")

    var person3 = WoMan(name = "小华华")

    //把所有人放在集合里
    var houseList = listOf<Human>(person1, person2, person3)


    for (h in houseList) {
        h.pee()
    }

}