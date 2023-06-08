const val maximumAge = 20
fun main() {
    println(maximumAge)
    val getDiscountWords = {goodsName:String,hour:Int->
        val currentYear = 2027
        "For now is ${currentYear}, $goodsName has $hour hours discount time."
    }
    var string = showOnBoard("卫生纸",getDiscountWords)
    println(string)
}

// 具名函数
fun showOnBoard(goodsName:String,getDiscountWords:(String,Int)->String){
    val hour = (1..24).shuffled().last()
    println(getDiscountWords(goodsName,hour))
}