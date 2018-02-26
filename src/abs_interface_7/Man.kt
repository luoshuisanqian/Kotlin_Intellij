package abs_interface_7

/**
 * Created by hming on 2018/2/24.
 */
class Man : Human(), I_Man {//实现I_Man接口
    override fun xiaodi() {
        println("man的特征")
    }

    override fun eat() {
        println("哇哇哇的大口吃饭")
    }
}