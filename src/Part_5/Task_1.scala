package Part_5

object Task_1 {
  def main(args: Array[String]): Unit = {
    val counter = new Counter(Int.MaxValue-20)
    for ( i <- 0 to 50){
      val in = counter.current()
      println(in)
      counter.increment()
    }
  }

  class Counter(n : Int){
    private var value : BigInt = n
    def increment(): Unit = {value = value +1}
    def current(): BigInt = value
  }
}
