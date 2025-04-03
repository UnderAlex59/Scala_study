package Part_2
import scala.io.StdIn

object Task_1 {
  def main(args: Array[String]): Unit = {
    while (true){
      val input = StdIn.readLine();

      if (input.equals("exit")){
        return
      }
      else{
        try{
          val res = if (input.toInt.equals(0)) 0 else input.toInt/input.toInt.abs
          println(res)
        }
        catch{
          case _: Exception => println("Введите число или команду выхода exit")
        }
      }
    }
  }

}
