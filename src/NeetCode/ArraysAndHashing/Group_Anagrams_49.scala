package NeetCode.ArraysAndHashing

import scala.collection.mutable

object Group_Anagrams_49 {
  def main(args : Array[String]):Unit = {
    val strs = Array("bdddddddddd","bbbbbbbbbbc")
    println(groupAnagrams(strs))

  }


  def groupAnagrams(strs: Array[String]): List[List[String]] = {
    val map = new mutable.HashMap[String, mutable.ArrayBuffer[String]]()
    for (i <- strs){
      //всего 26 букв английского алфавита по задаче
      val chars : Array[Int] = new Array[Int](26)
      for(j <- i){
        chars(j.toInt - 'a'.toInt) += 1
      }
      val key = chars.mkString(" ")
      if (map.contains(key)){
        map(key) += i
      }
      else map.put(key, mutable.ArrayBuffer(i))
    }
    val res = new mutable.ArrayBuffer[List[String]]
    for (i <- map){
      res += i._2.toList
    }
    res.toList
  }




//Излишне сложное и неэффективное решение
//  def groupAnagrams(strs: Array[String]): List[List[String]] = {
//    val map = new mutable.HashMap[Int, mutable.HashMap[String, mutable.ArrayBuffer[String]]]()
//    for (i <- strs) {
//      var status : Boolean = false
//      if (map.contains(i.length)) {
//        for (j <- map(i.length)) {
//          if (anagrams(j._1, i)) {
//            map(i.length)(j._1) += i
//            status = true
//          }
//        }
//        if(!status){
//          map(i.length).put(i, new mutable.ArrayBuffer[String])
//        }
//      }
//      else {
//        map.put(i.length, mutable.HashMap[String, mutable.ArrayBuffer[String]](i -> new mutable.ArrayBuffer[String]))
//      }
//    }
//
//    val res = new mutable.ArrayBuffer[List[String]]()
//    for(i <- map; j <- i._2){
//      res += (List(j._1) ++: j._2.toList)
//    }
//    res.toList
//  }
//
//
//  def anagrams(str_1 : String, str_2 : String) : Boolean ={
//    if (str_1.length != str_2.length) false
//    else{
//      val map = new mutable.HashMap[Char, Int]()
//      for (i <- str_1){
//        if (map.contains(i)){
//          map.update(i, map(i)+1)
//        }
//        else map.put(i, 1)
//      }
//      for(i <- str_2){
//        if (map.contains(i)){
//          if (map(i) == 1) map.remove(i)
//          else map.update(i, map(i)-1)
//        }
//        else return false
//      }
//      if (map.isEmpty) true
//      else false
//    }
//  }

}
