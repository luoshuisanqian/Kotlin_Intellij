package weituo_daili_8

/**
 * Created by hming on 2018/2/24.
 */

class SmallHeadFathor : I_WashBow by BigHeadSon() {//每次让小头爸爸洗碗就让儿子洗，便宜
    override fun washing() {
        println("我是小头爸爸，我赚了10块钱")
        BigHeadSon().washing()
        println("我看着儿子把碗洗完了")
    }
}