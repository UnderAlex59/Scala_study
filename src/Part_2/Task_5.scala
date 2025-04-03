package Part_2

object Task_5 {
  def main(args: Array[String]): Unit = {
    countdown(20)
  }

  def countdown(n : Int){
    for(i <- 0 to n; j = n - i){
      println(j)
    }
  }
}
