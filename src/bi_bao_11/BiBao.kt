package bi_bao_11

/**
 * Created by hming on 2018/2/24.
 */
fun test() :()->Unit{      //:()->Unit    表示它的返回值是一个函数，这个函数的返回值类型为空
    var i = 3;

    return fun() {
        i++;
        println("i的值为====${i}")

    }

}

fun main(args: Array<String>) {
    var t = test()

    t()
    t()
    t()
}