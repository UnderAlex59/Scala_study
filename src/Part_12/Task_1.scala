package Part_12

import scala.collection.mutable

object Task_1 {

  def main (args : Array[String]) : Unit = {
    println(values(x => x*x, -5, 5).mkString(", "))
    println(values(x => x*3, -5, 5).mkString(", "))
  }


  def values (fun : Int => Int, low : Int, high : Int) : scala.collection.mutable.Map[Int, Int] ={
    val map = new mutable.LinkedHashMap[Int, Int]
    for (i <- low to high){
      map.put(i, fun(i))
    }
    map
  }

}
