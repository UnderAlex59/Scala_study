package Part_3
import scala.io.StdIn.readLine

object Task_4 {
  def main(args: Array[String]): Unit = {
    val input = readLine().replace(" ", "").split(",").map(_.toInt)
    val posotive_id = input.indices.filter(input(_) > 0)
    val negative_or_zero = input.indices.filter(input(_) <= 0)
    val all_ordered_id = posotive_id ++ negative_or_zero
    val ordered_value = for (i <- all_ordered_id) yield input(i)
    println(ordered_value.mkString(", "))

  }

}
