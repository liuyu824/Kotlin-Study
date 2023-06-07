fun main() {
    println(doSomething(18,false))
    println(fix("刘宇",20))
    println(fix(stuAge = 100, stuName = "刘宇"))
}

private fun doSomething(age:Int,flag:Boolean):String{
    return "他的$age 是${if (flag) "真实" else "不真实"}的"
}

fun fix(stuName:String,stuAge:Int=2):String{
    return "学生的名字是$stuName,学生的年龄是$stuAge"
} 