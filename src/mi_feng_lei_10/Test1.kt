package mi_feng_lei_10

/**
 * Created by hming on 2018/2/24.
 */

fun main(args: Array<String>) {
    var s1:Son = Son.小小驴()
    var s2:Son = Son.小骡子()
    var s3:Son = Son.小小驴()

    var list = listOf<Son>(s1,s2,s3)

    for (v in list) {
        if (v is Son.小骡子) {
            v.sayHello()
        }
    }

}