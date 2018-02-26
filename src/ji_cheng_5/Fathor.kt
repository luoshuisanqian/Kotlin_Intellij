package ji_cheng_5

/**
 * Created by hming on 2018/2/23.
 *
 * 继承：父亲
 */
open class Fathor {//open 允许继承

    var chactor:String="性格内向"//属性
    //行为，动作，方法
    open fun action() { //open 允许被重写
        println("在公共场合喜欢大声说话")
    }
}

