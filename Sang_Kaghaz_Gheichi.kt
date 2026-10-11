import kotlin.random.Random

fun main(args: Array<String>) {
    // نمایش ایموجی
    val kotlin = "🙂"
    println(kotlin)

    val choices = listOf("سنگ", "کاغذ", "قیچی")
    val input = args.firstOrNull()?.trim()

    val player = when (input) {
        "1" -> "سنگ"
        "2" -> "کاغذ"
        "3" -> "قیچی"
        else -> {
            println("عدد 1، 2 یا 3 را وارد کن.")
            println("1 = سنگ، 2 = کاغذ، 3 = قیچی")
            return
        }
    }

    val computer = choices.random()

    println("انتخاب تو: $player")
    println("انتخاب کامپیوتر: $computer")

    when {
        player == computer -> println("مساوی!")
        (player == "سنگ" && computer == "قیچی") ||
        (player == "کاغذ" && computer == "سنگ") ||
        (player == "قیچی" && computer == "کاغذ") ->
            println("تو برنده شدی!")
        else -> println("کامپیوتر برنده شد!")
    }
}
