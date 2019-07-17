class SensorsMeltException() : Exception() {}
class EngineNotFoundException() : Exception() {}

fun rawEngineStatus(engineNumber: Int): String {
  return ""
}

fun engineStatus(engineNumber:Int): String{
  try {
    val result: String = rawEngineStatus(engineNumber)
    return result
  } catch(e: EngineNotFoundException) {
    return "engine ${engineNumber} not found"
  } catch (e: SensorsMeltException) {
    return "engine ${engineNumber} offline"
  }
}