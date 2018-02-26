package mian_xiang_dui_xiang_4

import javax.security.auth.spi.LoginModule

/**
 * Created by hming on 2018/2/23.
 */

/**
 * 程序员A创建的洗衣机:    模型，尺寸
        **/
class WashMachine (var module: String, var size:Int){
    var isDoorOpen = true //洗衣机门是否关闭
    var currentMode = 0;//洗衣机模式


    fun openDoor() {
        isDoorOpen = true
        println("洗衣机门打开了。。。")
    }

    fun closeDoor() {
        isDoorOpen = false
        println("洗衣机门已经关闭了。。。")
    }

    /**
     * 设置洗衣机的模式
     * **/
    fun selectMode(mode:Int) {
        currentMode = mode
        when(mode) {
            0-> println("初始模式")
            1-> println("轻柔")
            2-> println("狂柔")
            else -> println("不要乱拧，拧坏了不管")
        }
    }


    fun start() {
        if (isDoorOpen) {
            println("呼呼。。门还没关，不能运行")
        } else {

            when(currentMode) {
                0-> {println("选择模式错误，不能开始洗衣服")}
                1-> {
                    println("轻柔开始，发动机转速慢")
                    setMotorSpeed(10)
                }

                2-> {println("狂柔开始，发动机转速快")
                    setMotorSpeed(100)}
                else ->{"模式不能被识别"}
            }

        }

    }

   private fun setMotorSpeed(speed:Int) {
        println("洗衣机的转速是${speed}圈/秒")
    }


}