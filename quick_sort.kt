fun swap(list: MutableList<Int>, fI: Int, sI: Int) {
  val tmp = list[fI]
  list[fI] = list[sI]
  list[sI] = tmp
}

fun sort_prtition(list: MutableList<Int>, l: Int, r: Int): Pair<Int, Int> {
  var left = l
  var right = r
  val piv_index = left + (right - left) / 2
  val pivot = list[piv_index]

  while (left <= right) {
    while (list[left] < pivot) { left++ }
    while (list[right] > pivot) { right-- }

    if (left <= right) {
      swap(list, left++, right--)
    }
  }

  return Pair(left, right)
}

fun sort(list: MutableList<Int>, l: Int = 0, r: Int = list.lastIndex) {
  val queue: MutableList<Pair<Int, Int>> = mutableListOf(Pair(l, r))
  while (queue.size != 0) {
    val (tL, tR) = queue.get(queue.lastIndex)
    queue.removeAt(queue.lastIndex)
    if (tL < tR) {
      val (pL, pR) = sort_prtition(list, tL, tR)
      queue.add(Pair(tL, pR))
      queue.add(Pair(pL, tR))
    }
  }
}

fun b_search(list: List<Int>, s_el: Int): Boolean {
  var l = 0
  var r = list.size
  var m = l + ((r - l) / 2)

  loop@ while (m >= l && m < r) {
    when {
      list[m] == s_el -> return true
      list[m] > s_el -> {
        r = m
        m = (l + ((r - l) / 2))
      }
      list[m] < s_el -> {
        l = m + 1
        m = (l + ((r - l) / 2))
      }
      else -> { break@loop }
    }
  }

  return false
}
 
fun main(args: Array<String>) {
  val l = mutableListOf(5, 1, 2, 4)
  sort(l)
  println("${l}")
  println("${b_search(l, 6)}")
}