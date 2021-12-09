fun main() {

    val name = "Mandrigal"
    val healtPoints = 88
    val race = "gnome"
    var isBlassed = true

    //Состояние здоровья
    val healtStatus = formatHealtStatus(healtPoints, isBlassed)

    //Аура
    var isImmortal = false //режим бога
    printPlayerStatus(isBlassed, healtPoints, isImmortal, name, healtStatus)

    playerHeroClan(race)

    castFireball(50)
}

private fun formatHealtStatus(healtPoints: Int, isBlassed: Boolean): String =
    when (healtPoints) {
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


private fun printPlayerStatus(
    isBlassed: Boolean,
    healtPoints: Int,
    isImmortal: Boolean,
    name: String,
    healtStatus: String,
) {
    val auraVisible = isBlassed && healtPoints > 50 || isImmortal
    val auraColor = if (auraVisible) "GREEN" else "NONE"

    //Состояние игрока
    println("Aura: $auraColor" + " Blassed: ${if (isBlassed) "YES" else "NO"}")
    println("$name $healtStatus")
}

private fun playerHeroClan(race: String) =
    when (race) {
        "dwarf" -> println("Клан: Гоблинов")
        "gnome" -> println("Клан: Гномов")
        "orc" -> println("Клан: Орков")
        "human" -> println("Клан: Людей")
        else -> println("Никто")
    }

private fun castFireball(numFireballs: Int) =
    when(numFireballs){
        in 1 .. 10 -> println("Состояние: Навеселе")
        in 11 .. 20 -> println("Состояние: Выпивший")
        in 21 .. 30 -> println("Состояние: Пьяный")
        in 31 .. 40 -> println("Состояние: Сильно пьяный")
        in 41 .. 50 -> println("Состояние: В стельку")
        else -> println("Состояние: Не пил")
    }

