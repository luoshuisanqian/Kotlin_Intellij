package mi_feng_lei_10

/**
 * Created by hming on 2018/2/24.
 */

//小母驴，小公驴，小公马生下来的儿子
sealed class Son {  //sealed 表示密封类
    fun sayHello() {
        println("大家好")
    }

    class 小小驴() : Son()
    class 小骡子() : Son()

}