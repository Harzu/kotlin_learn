fun calculateWordStat(input: String): String {
    val in_spl: List<String> = input.split(" ")
    val w_mp: MutableMap<String, Int> = mutableMapOf()

    for (word in in_spl) {
      when (w_mp.contains(word)) {
        false -> w_mp.put(word, 1)
        true -> {
          var count: Int? = w_mp.get(word)
          if (count != null) {  
            w_mp.set(word, ++count)
          }
        }
      }
    }
    
    return w_mp
      .toList()
      .sortedBy({(_, value) -> value})
      .toMap()
      .keys.last()
}

fun main(args: Array<String>) {
  println("${calculateWordStat("KTTKAP ZSAC RKSLNFE LYAB ZSAC ZSAC NQUZKL LYAB ZSAC KTTKAP ZSAC ZSAC KTTKAP RKSLNFE ZSAC ZSAC RKSLNFE LYAB ZSAC RKSLNFE KTTKAP LYAB RKSLNFE NQUZKL RKSLNFE LYAB RKSLNFE RKSLNFE LYAB RKSLNFE KTTKAP ZSAC RKSLNFE KTTKAP ZSAC LYAB LYAB LYAB RKSLNFE ZSAC")}")
}