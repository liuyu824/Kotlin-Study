import java.util.*

fun main() {

    var str = readlnOrNull()
    println(str!!.capitalize())
    str = str.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }
    println(str)
}