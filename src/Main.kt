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
    println("\n Books we have available:")
    for (book in bookList) {
        book.printDetails()
    }

    println("\n What book are you looking for?")
    val userInput = readlnOrNull()?.trim()

    println("You entered -> '$userInput'")

    if (userInput.isNullOrBlank()) {
        println("We don't have that book. Try another one!")
    } else {
        val foundBook = findBookByTitle(userInput)
        foundBook?.printDetails() ?: println("Book not found.")
    }
}

