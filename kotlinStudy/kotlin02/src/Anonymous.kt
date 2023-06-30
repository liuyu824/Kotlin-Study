fun main() {
    // 匿名函数
    val total = "Mississippi".count()

    // 重写匿名函数，按照右边默认写定的count()方法
    val totalTest = "Mississippi".count {
            letter -> true
    }

    // 重写匿名函数，改写默认的count()方法
    val totalS = "Mississippi".count {
        letter -> letter == 's'
    }

    // 再简略写法
    val countS = "Mississippi".count{it == 's'}

    // Kotlin中对 CharSequence 类进行了扩展;
    // 定义了 count(predicate:(Char)->Boolean)扩展函数;
    // 接受一个 (Char)->Boolean 类型的函数;
    // 用于返回匹配给定 匿名函数 的字符数
    println(total)
    println(totalTest)
    println(totalS)

    // 变量的类型是一个匿名函数
    val blessingFunction:()->String = {
        val holiday = "New Year."
        "Happy $holiday"
    }
    println(blessingFunction())
}