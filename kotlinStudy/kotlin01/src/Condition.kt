fun main(){

    val age = 50
    ageCondition(age);

    val school = "研究生"
    val level :Any = when (school){
        "幼儿园" -> "幼儿"
        "小学" -> "小学生"
        "初中" -> "少年"
        "研究生" -> "青年"
        else->{
            println("未知等级")
        }
    }
    println(level)
}

fun ageCondition(age:Int){
    if (age in 0..3){
        println("婴幼儿")
    } else if (age in 4..18){
        println("青少年")
    } else {
        println("成年人")
    }
}