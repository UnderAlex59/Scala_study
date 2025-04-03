package Part_3

object Task_7 {
  def main(args: Array[String]): Unit = {
    val arr = Array[Int](4,6,7,8,9,8, 1,2,3,4,5,6,2)
    println(arr.toSet.mkString(", "))

    println(arr.distinct.mkString(", "))
  }

}
