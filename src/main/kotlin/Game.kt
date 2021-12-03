fun main() {

    val name = "Mandrigal"
    val healtPoints = 88
    val race = "gnome"
    var isBlassed = true

    //Состояние здоровья
    val healtStatus = when (healtPoints) {
        100 -> "Полное здоровье"
        in 90..99 -> "Игрок не много поцарапан"
        in 75..89 -> if (isBlassed) {
            "Режим восстановления здоровья"
        } else {
            "имеет несколько незначительных ран"
        }
        in 15..74 -> "Сильно ранен"
        else -> "Игрок в плохой форме"
    }

    //Клан игрока
    val faction = when (race) {
        "dwarf" -> "Клан Гоблинов"
        "gnome" -> "Клан Гномов"
        "orc" -> "Клан Орков"
        "human" -> "Клан Людей"
        else -> "Никто"
    }

    //Аура
    var isImmortal = false //режим бога

    val auraVisible = isBlassed && healtPoints > 50 || isImmortal
    val auraColor = if (auraVisible) "GREEN" else "NONE"

    //Состояние игрока
    println("Aura: $auraColor" + " Blassed: ${if (isBlassed) "YES" else "NO"}")

    println("$name $healtStatus")
}