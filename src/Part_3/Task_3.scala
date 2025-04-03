package Part_3
import scala.io.StdIn.readLine

object Task_3 {
  def main(args: Array[String]): Unit = {
    val arr : Array[String] = readLine().replace(" ", "").split(",")
    println(arr.mkString("Array(", ", ", ")"))
    val arr_2 = for(i <- 0 until arr.length) yield {
      if (i % 2 == 0){
        if (i +1 < arr.length){
          arr(i+1)
        }
        else arr(i)
      }
      else {
        arr(i-1)
      }
    }

    println(arr_2.mkString(", "))
  }
}