fun <T> max(values: List<T>, less: (T, T) -> Boolean): Boolean {
  return less(values[0], values[1])
}

fun main(args: Array<String>) {
  println("${max<Int>(listOf(1, 2), { a, b -> a > b })}")
  val lambda_sum: (Int, Int) -> Int = { a: Int, b: Int -> a + b }
  println("${lambda_sum(2, 3)}")
}