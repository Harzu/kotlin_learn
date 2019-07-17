fun calculateEvenDigits(input: String): Int {
  var result: Int = 0
  for (char in input) {
    val c_int: Int = char.toString().toInt()
    if (c_int != 0 && c_int % 2 == 0) {
      result += c_int
    }
  }

  return result
}

fun main(args: Array<String>) {
  println("${calculateEvenDigits("660308340")}")
}