package ji_cheng_5

/**
 * Created by hming on 2018/2/23.
 */
class Son : Fathor() {//继承
    //重写
    override fun action() {
        println("son很有礼貌，在公共场合不吵闹")
    }
}