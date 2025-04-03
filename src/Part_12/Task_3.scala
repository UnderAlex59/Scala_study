package Part_12

object Task_3 {
  def main(args: Array[String]): Unit = {
    println(factorial(-5))
  }

  def factorial(n : Int) : Int = {
    if (n < 1) 1
    else 1 to n reduceLeft(_*_)
  }

}
