fun main() {
    showOnBoardAgain("卫生纸"){goodsName:String,hour:Int->
        val currentYear = 2077
        "For now is ${currentYear}, " +
                "$goodsName has $hour hours discount time."
    }
}

// 具名函数
fun showOnBoardAgain(goodsName:String,getDiscountWords:(String,Int)->String){
    val hour = (1..24).shuffled().last()
}

