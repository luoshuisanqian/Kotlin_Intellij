package abs_interface_7

/**
 * Created by hming on 2018/2/24.
 */

fun main(args: Array<String>) {
    var man1 = Man()
    man1.xiaodi()

    var man2 = TaiJian()
    man2.eat()

    //把变量放进集合里面
    var hourse = listOf<Human>(man1, man2)

    for (p in hourse) {
        if (p is Man) {//如果是男
            p.xiaodi()
        }
    }
}
