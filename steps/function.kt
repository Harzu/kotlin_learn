fun sum(a: Int = 0, b: Int = 0): Int {
  return a + b
}

fun main(args: Array<String>) {
  println("sum 1 + 2 ${sum(1, 2)}")
}