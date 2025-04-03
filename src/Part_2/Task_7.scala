package Part_2
import scala.io.StdIn

object Task_7 {
  def main(args: Array[String]): Unit = {
    val input = StdIn.readLine()
    val res: Long = input.toCharArray.map(_.toLong).product
  println(res)
  }
}
