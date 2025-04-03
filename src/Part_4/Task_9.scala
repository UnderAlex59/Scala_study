package Part_4

object Task_9 {
  def main(args: Array[String]): Unit = {
    val arr = Array(10,20,30,-50,8000, 1516, 777)
    println(lteqgt(arr, 30))
  }

  def lteqgt(values: Array[Int], v: Int) : (Int, Int, Int) = {
    (values.count( _ < v), values.count( _.equals(v)), values.count( _ > v))
  }
}
