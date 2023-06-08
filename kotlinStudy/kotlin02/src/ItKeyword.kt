fun main() {

    val blessingFunction:(String)->String = {
        val holiday = "New Year!"
        "$it, happy $holiday"
    }
    println(blessingFunction("Jacky"))
}