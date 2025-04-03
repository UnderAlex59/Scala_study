package Part_3

object Task_10 {
  def main(args: Array[String]): Unit = {
    val arr = java.util.TimeZone.getAvailableIDs.filter(_.startsWith("America")).map(_.replace("America/", "")).sorted
    println(arr.mkString(", "))
  }

}
