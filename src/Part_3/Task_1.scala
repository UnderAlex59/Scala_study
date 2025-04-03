package Part_3
import scala.io.StdIn.readInt
object Task_1 {
  def main(args: Array[String]): Unit = {
    val n = readInt()
    val a : Array[Int] = new Array[Int](n)
    for(i <- 0 until n){
      a(i) = i
    }
    println(a.mkString("Array(", ",", ")"))
  }
}
