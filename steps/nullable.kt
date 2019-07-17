fun getLength(str: String?): Int? {
  return str?.let { str.length } ?: 0
}

fun calcNullValues(input: Array<Int?>): Array<Int>{
  var nullableCount = 0
  var notNullableSum = 0
  for (item in input) {
    if (item == null) {
      nullableCount++
    } else {
      notNullableSum += item
    }
  }

  return arrayOf(nullableCount, notNullableSum)
}

fun main(args: Array<String>) {
  println("${getLength("MT3C0V5IA7EN2VLEAJYU3PWHJ6X4OGGXIHBHHKLYQZH5738HNVZRTGO0MHGRZGZDKDS9SIQ7S3Q5L9L2QISAXDRW1W7F156SYM")}")
  println("${getLength(null)}")
}