package chouxiang_jicheng_6

/**
 * Created by hming on 2018/2/24.
 */
class Man(name:String) : Human(name) {
    override fun eat() {
        println("${name}哇哇哇的大口吃")
    }

    override fun pee() {
        println("${name}站着小便")
    }
}