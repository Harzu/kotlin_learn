fun calcChairs(x: Int = 0): Int {
  return x + (x / 2).toInt()
}

fun main(args: Array<String>) {
  println("${calcChairs(12)}")
}