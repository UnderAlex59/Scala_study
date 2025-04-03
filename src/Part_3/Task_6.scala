package Part_3

import scala.collection.mutable.ArrayBuffer

object Task_6 {
  def main(args: Array[String]): Unit = {
    val arr_1 = Array[Int](20,10,50,80,5,1,4,70)
    val arr_2 : ArrayBuffer[Int] = ArrayBuffer[Int](20,10,50,80,5,1,4,70)

    println(arr_1.sorted.reverse.mkString(", "))
    println(arr_2.sorted.reverse.mkString(", "))
  }


}
