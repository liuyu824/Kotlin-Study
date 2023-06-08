fun main() {
    val blessingFunction01 = {
        val holiday = "New Year."
        "Happy $holiday"
    }
    println(blessingFunction01())

    // 匿名函数推断
    val blessingFunction02:(String,Int) -> String={
        stuName,stuPNum->
        "$stuName's telephone number is $stuPNum"
    }
    println(blessingFunction02("刘宇", 13))

    // 匿名函数推断
    val blessingFunction03 ={
            stuName:String,stuAge:Int->
        "$stuName's age is $stuAge"
    }
    println(blessingFunction03("刘宇", 13))

}