class SugarStorage(var volume: Int) {
  fun decreaseSugar(v: Int) {
    if (v < 0) {
      return
    }

    volume = if (v > volume) 0 else volume + v
  }

  fun increaseSugar(v: Int) {
    if (v < 0) {
      return
    }
    volume += v
  }
}

open class Bug(val rank: Int, val name:String) {
    open fun getSugarLimit(): Int{
        return rank
    }
    
    fun getId(): String{
        return "${rank}.${name}"
    }
} 

class BugCivilian(rank: Int, name: String) : Bug(rank, name) {
  override fun getSugarLimit(): Int = (super.getSugarLimit() / 2).toInt()
}