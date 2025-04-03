package Part_4
import scala.collection.mutable
object Task_6 {
  def main(args: Array[String]): Unit = {
    val week_linkedMap = new scala.collection.mutable.LinkedHashMap[String, Int]()
    val week_hashMap = new mutable.HashMap[String, Int]()
    week_linkedMap += ("Monday" -> java.util.Calendar.MONDAY,
      "Tuesday" -> java.util.Calendar.TUESDAY,
      "WEDNESDAY" -> java.util.Calendar.WEDNESDAY,
      "THURSDAY" -> java.util.Calendar.THURSDAY,
      "FRIDAY" -> java.util.Calendar.FRIDAY,
      "SATURDAY" -> java.util.Calendar.SATURDAY,
      "SUNDAY" -> java.util.Calendar.SUNDAY)

    week_hashMap += ("Monday" -> java.util.Calendar.MONDAY,
      "Tuesday" -> java.util.Calendar.TUESDAY,
      "WEDNESDAY" -> java.util.Calendar.WEDNESDAY,
      "THURSDAY" -> java.util.Calendar.THURSDAY,
      "FRIDAY" -> java.util.Calendar.FRIDAY,
      "SATURDAY" -> java.util.Calendar.SATURDAY,
      "SUNDAY" -> java.util.Calendar.SUNDAY)

    println(week_linkedMap)
    println(week_hashMap)

    for (i <- week_linkedMap){
      println(i)
    }

  }




}
