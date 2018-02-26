package tupianchuli_12

import java.awt.image.BufferedImage
import java.io.File
import javax.imageio.ImageIO

/**
 * Created by hming on 2018/2/24.
 */

fun main(args: Array<String>) {
    var image = BufferedImage(100,100,BufferedImage.TYPE_INT_RGB)//宽100，高100，类型RGB  //BufferedImage 这个Api表示在内存中生成一个图片

    image.setRGB(0,0,0xff0000) //在左上角位置设置为红色

    var w = 0.. 99//宽
    var h = 0.. 99//高

    //保存图片
//    ImageIO.write(image, "bmp", File("a.bmp"))//把image图片写出来，扩展名为bmp,写入这个文件

    image.apply {
        for (i in w) {
            for (j in h) {
                setRGB(i, j, 0xff0000)  //每个点涂成红色
            }
        }
    }

    //保存图片
    ImageIO.write(image, "bmp", File("a.bmp"))//把image图片写出来，扩展名为bmp,写入这个文件
}