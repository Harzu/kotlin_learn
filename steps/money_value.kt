fun calcBugMoneyValue(dayNumber: Int, bugRank: Int, cashAmount: Int): Int {
    val curse: Int = (dayNumber * bugRank) + 42
    return cashAmount * curse
}

fun main(args: Array<String>) {
  println("${calcBugMoneyValue(10, 2, 25)}")
}