package Part_2
import scala.io.StdIn

object Task_6 {
  def main(args: Array[String]): Unit = {
    val input = StdIn.readLine()
    var res : Long = 1
    for(i<-input){
      res *= i.toInt
    }
    println(res)
  }

}
