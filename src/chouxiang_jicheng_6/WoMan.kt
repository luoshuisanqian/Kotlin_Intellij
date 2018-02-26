package chouxiang_jicheng_6

/**
 * Created by hming on 2018/2/24.
 */
class WoMan(name:String) : Human(name) {
    override fun eat() {
        println("${name}小口吃")
    }

    override fun pee() {
        println("${name}蹲着小便")
    }
}