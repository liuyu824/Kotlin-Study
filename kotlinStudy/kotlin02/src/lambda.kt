fun main() {

    // 原始状态，全部声明状态
    val sumOrigin:(Int,Int)->Int = {x:Int,y:Int->x+y}

    // 简化后，前后只有一个声明就可以
    // 前声明，后省略
    val sumStart:(Int,Int)->Int = {x,y->x+y}

    // 前省略，后声明
    val sumEnd = {x:Int,y:Int->x+y}

    val add = {x:Int->
        val y = x + 1
        y
    }
    add(1)

    fun foo(int: Int) = {
        print(int)
    }
//    listOf(1,2,3).forEach{foo(it)}

//    println()
//    println("-----------")
    listOf(1,2,3,4).forEach{item->foo(item)}

    var whether = "whetherWhether"

    // 会报错：null值无法对一个非空类型变量赋值
    // whether = null

    // 如何能够转呢
    var changeNull: String? = "thisValueCanBeNull"
//    changeNull = null;

    println(changeNull?.capitalize())

    var str = changeNull?.let {
        if (it.isNotBlank()){
            it.capitalize()
        }else{
            "isNull"
        }
    }
    println(str)
}
