package mei_ju_9

/**
 * Created by hming on 2018/2/24.
 */
enum class  Week {
    星期一,星期二,星期三,星期四,星期五,星期六,星期日
}

fun main(args: Array<String>) {

    println("打印某个值的下脚标：${Week.星期一.ordinal}")
}