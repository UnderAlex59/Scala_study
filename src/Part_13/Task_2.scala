package Part_13

import scala.collection.mutable

object Task_2 {
  def main(args: Array[String]): Unit = {
    for (i <- indexes("Mississippi")){
      print(i._1 + "-> " + i._2.mkString("{", ", ", "}") +"\n")
    }
  }

  def indexes(str : String): scala.collection.immutable.HashMap[Char, scala.collection.mutable.TreeSet[Int]] = {
    var res = new scala.collection.immutable.HashMap[Char, scala.collection.mutable.TreeSet[Int]]
    for (i <- str.distinct){
      res = res + (i -> new mutable.TreeSet[Int]())
    }
    for (i <- 0 until(str.length)){
      val temp = res.get(str.charAt(i)).get + i
      res = res - str.charAt(i)
      res = res + (str.charAt(i) -> temp)
    }
    res
  }
}
