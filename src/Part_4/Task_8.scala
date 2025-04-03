package Part_4

object Task_8 {
  def main(args: Array[String]): Unit = {
    val arr = Array(10,20,30,-50,8000)
    println(minmax(arr).getClass)
  }


  def minmax(values : Array[Int]) : (Int, Int) = {
    (values.max, values.min)
  }

}
