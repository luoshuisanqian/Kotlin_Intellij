package mian_xiang_dui_xiang_4

/**
 * Created by hming on 2018/2/23.
 */
/**
 * 程序员B写的代码
 * 需求：洗衣服
 * **/
fun main(args: Array<String>) {
    var washMachine = WashMachine("小天鹅", 12)//模型，尺寸
    washMachine.openDoor()
    println("把秋衣放进去了")
    washMachine.closeDoor()
    washMachine.selectMode(1)
    washMachine.start()


}