package Part_12

object Task_2 {
  def main(args: Array[String]): Unit = {
    val arr : Array[Int] = Array(10,20,30,50,-80,100,70,1,5,8,9)
    println(arr.reduceLeft((x,y) => if (x > y) x else y))
  }
}
