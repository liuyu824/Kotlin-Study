fun main() {
    val total = "Mississippi".count()
    val totals = "Mississippi".count { letter -> letter == 's' }

    println(total)
    println(totals)

    // 变量的类型是一个匿名函数
    val blessingFunction:()->String = {
        val holiday = "New Year."
        "Happy $holiday"
    }
    println(blessingFunction())
}