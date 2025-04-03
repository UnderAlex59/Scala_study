package Part_13
import scala.collection.mutable
import System.nanoTime

object Task_3 extends App{
  val arr : mutable.ListBuffer[Int] = mutable.ListBuffer(0,1,2,3,4,5,6,7,8,9,10,11,12,13)
  val new_arr : mutable.ListBuffer[Int] = new mutable.ListBuffer
  var start_time = nanoTime()
  copyraiter(arr, new_arr)
  println(new_arr.mkString(" "))
  var end_tume = nanoTime()
  println(s"Время выполнения функции через копирование элементов составило ${end_tume-start_time}")
  start_time = nanoTime()
  remover(arr)
  println(arr.mkString(" "))
  end_tume = nanoTime()
  println(s"Время выполнения функции через удаление элементов составило ${end_tume-start_time}")

  def remover(arr: scala.collection.mutable.ListBuffer[Int]): Unit = {
    for (i <- arr.indices.reverse) {
      if (i % 2 == 0) arr.remove(i)
    }

  }

  def copyraiter (arr : scala.collection.mutable.ListBuffer[Int], new_arr : scala.collection.mutable.ListBuffer[Int]) : Unit= {
    for (i <- arr.indices) {
      if (i % 2 != 0) new_arr += arr(i)
    }
  }
}

