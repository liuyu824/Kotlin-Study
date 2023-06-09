fun main() {
    val getDiscountWords = {goodsName:String,hour:Int->
        val currentYear = 2077
        "For now is ${currentYear}, $goodsName has $hour hours discount time."
    }
    val string = showOnBoard("卫生纸",getDiscountWords)
    println(string)
}

// 具名函数
fun showOnBoard(goodsName:String,getDiscountWords:(String,Int)->String){
    val hour = (1..24).shuffled().last()
}

