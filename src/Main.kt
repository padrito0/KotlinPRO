class Book(val title: String, val author: String, val year: Int?) {

    init {
        println("Book created: $title by $author")
    }

    fun printDetails() {
        val yearPublished = year ?: "UNKNOWN"
        println("Title: $title - Author: $author - Year: $yearPublished")
    }
}

val bookList = mutableListOf(
    Book("1984", "George Orwell", 1949),
    Book("Brave New World", "Aldous Huxley", 1932),
    Book("Fahrenheit 451", "Ray Bradbury", null)
)

fun findBookByTitle(title: String): Book? {
    return bookList.find { it.title.equals(title.trim(), ignoreCase = true) }
}

fun main() {
    val name = "Kotlin"
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    println("Hello, " + name + "!")

    for (i in 1..5) {
        //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
        // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
        println("i = $i")
    }
}