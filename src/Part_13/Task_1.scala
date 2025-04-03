package Part_13

import scala.collection.mutable

object Task_1 {
  def main(args: Array[String]): Unit = {
    for (i <- indexes("Hello")){
      print(i._1 + "-> " + i._2.mkString("{", ", ", "}") +"\n")
    }
  }
  //Если нужно выводить символы в порядке их встречи в слове, то нужно использовать LinkedHashMap, например
  def indexes(str : String): mutable.HashMap[Char, scala.collection.mutable.TreeSet[Int]] = {
    val res = new mutable.HashMap[Char, scala.collection.mutable.TreeSet[Int]]
    for (i <- str.distinct){
      res.put(i, new mutable.TreeSet[Int])
    }
    for (i <- 0 until(str.length)){
      res.put(str.charAt(i), res.get(str.charAt(i)).get+i)
    }
    res
  }
}
