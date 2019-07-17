fun getCubeList(i: Int): List<Int> {
  var list: MutableList<Int> = mutableListOf(0)

  for (i in 1 until i) {
    list.add(i * i * i)
  }

  return list
}

fun main(args: Array<String>) {
  println("${getCubeList(7)}")
}