fun calculateBugMentions(input: List<String>): Int {
    var count: Int = 0
    for (word in input) {
      if (word == "BUG") { count++ }
    }

    return count
}

fun main(args: Array<String>) {
  println("${calculateBugMentions(listOf("KLPQYM", "BUG", "JVOJTD", "KLPQYM", "BUG", "BUG", "BUG"))}")
}