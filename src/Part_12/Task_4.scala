package Part_12

object Task_4 {
  def main(args: Array[String]): Unit = {
    println(factorial(-5))
    println(factorial(5))
  }

  def factorial(n : Int) : Int = {
    (1 to n).foldLeft(1)(_*_)
  }

}