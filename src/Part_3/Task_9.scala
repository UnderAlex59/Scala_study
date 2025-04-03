package Part_3

import scala.collection.mutable.ArrayBuffer

object Task_9{
  def main(args: Array[String]): Unit = {
    val arr = ArrayBuffer[Int](1,2,-1,5,-8,-9,-4,4,7,-8, 10, 21)
    println(arr.mkString(", "))
    val negative_id = arr.indices.filter(arr(_) < 0).tail
    val move_id = arr.indices.filter(_ > negative_id(0)).filter(arr(_) >= 0)
    val target_id = negative_id(0) until negative_id(0) + move_id.length
    for (i <- move_id.indices){
      arr.update(target_id(i), arr(move_id(i)))
    }
    arr.trimEnd(negative_id.length)
    println(arr.mkString(", "))
  }
}
