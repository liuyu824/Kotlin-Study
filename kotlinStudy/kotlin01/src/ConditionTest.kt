fun main() {
    println(ageConditionTest(18,"中考"))
    println(ageConditionTest(18,"高考"))
    println(ageConditionTest(17,"小升初"))
}

fun ageConditionTest(stuAge:Int,stuStatus:String):String{
    val stuTrueStatus = when(stuAge){
        18 -> "高考"
        15 -> "中考"
        12 -> "小升初"
        else -> "未知"
    }
    return "学生自己阐述今年${stuAge}岁，目前的阶段是${stuStatus}," +
            "学生所述是${if(stuStatus == stuTrueStatus)"真实" else "虚假"}的，真实的阶段是$stuTrueStatus"
}