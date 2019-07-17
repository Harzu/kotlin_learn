fun getYearEra(year: Int): String {
    var year_to_str: String = ""
    when {
      year == 1970 -> year_to_str = "equals"
      year < 1970 -> year_to_str = "before"
      year > 1970 && year < 2000 -> year_to_str = "after (XX century)"
      year >= 2000 && year < 2100 -> year_to_str = "after (XXI century)"
      year >= 2100 -> year_to_str = "distant future"
    }

    return year_to_str
}

fun main(args: Array<String>) {
  println("${getYearEra(1970)}")
}