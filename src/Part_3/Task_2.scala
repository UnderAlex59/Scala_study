package Part_3
import scala.io.StdIn.readLine
object Task_2 {
  def main(args: Array[String]): Unit = {
    val arr : Array[String] = readLine().replace(" ", "").split(",")
    println(arr.mkString("Array(", ", ", ")"))
    for(i <- 0 until (arr.length, 2)){
      val temp_first = arr(i)
      if (i < arr.length-1){
        arr(i) = arr(i+1)
        arr(i+1) = temp_first
      }
    }
    println(arr.mkString("Array(", ", ", ")"))
  }
}
