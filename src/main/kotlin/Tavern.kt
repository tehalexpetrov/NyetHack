import java.util.*

fun main() {
    var beverage = readLine()
    //beverage = null

       beverage?.let {
           beverage = it.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }
       } ?: println("Строка не может быть null")

    println(beverage)
}