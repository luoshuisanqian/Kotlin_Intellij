package chouxiang_jicheng_6

/**
 * Created by hming on 2018/2/24.
 */

//抽象的人类
abstract class Human(var name : String) { //生出来就有名字属性
    //行为方法
    abstract fun eat()

    abstract fun pee() //小便

}