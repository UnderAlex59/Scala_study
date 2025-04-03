package NeetCode.ArraysAndHashing

import scala.collection.mutable

object ValidAnagram_242 {
  def main(args : Array[String]) : Unit = {
    val s = "rat"
    val t = "car"
    println(isAnagram(s, t))
  }
  def isAnagram(s: String, t: String): Boolean = {
    if (s.length != t.length) false
    else{
      val map = new mutable.HashMap[Char, Int]()
      for (i <- s){
        if(map.contains(i)){
          map.update(i, map(i) + 1)
        }
        else map.put(i, 1)
      }
      for(i <- t){
        if(map.contains(i)){
          val temp : Int = map(i)
          if (temp > 1) map.update(i, temp - 1)
          else map.remove(i)
        }
        else return false
      }
      map.isEmpty
    }

  }
}
