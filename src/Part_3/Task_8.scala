package Part_3

import scala.collection.mutable.ArrayBuffer

object Task_8 {
  def main(args: Array[String]): Unit = {
    val arr = ArrayBuffer[Int](1,2,-1,5,-8,-9,-4,4,7,-8)
    println(arr.mkString(", "))
    for(i <- arr.indices.filter(arr(_) < 0).tail.reverse){
      arr.remove(i)
    }
    println(arr.mkString(", "))
  }

}
