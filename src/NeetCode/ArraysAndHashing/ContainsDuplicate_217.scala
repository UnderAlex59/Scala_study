package NeetCode.ArraysAndHashing

import scala.annotation.tailrec
import scala.collection.mutable


object ContainsDuplicate_217 {
  def main(args: Array[String]): Unit = {
    val array : Array[Int] = Array(1,2,3,4,5,6,7,8,9)
    val array2 : Array[Int] = Array(1,2,3,4,5,6,6,8,9)
    println(startHasDuplicatesRec(array))
    println(startHasDuplicatesRec(array2))
  }


  def hasDuplicates(nums : Array[Int]) : Boolean = {
    val freqMap : mutable.HashSet[Int] = new mutable.HashSet[Int]()
    var res : Boolean = false
    for (i <- nums){
      if (freqMap.contains(i)){
          res = true
      }
      else freqMap.add(i)
    }
    res
  }

  //В скала 3 есть специальные классы для прерывания кода - привычные break
  //С их использованием получилось ещё сократить время выполнения, поскольку теперь цикл
  //завершается после первого дубликата (то, что в scala 2 работало через return)
//  import scala.collection.mutable
//  import scala.util.boundary, boundary.break
//  object Solution {
//    def containsDuplicate(nums: Array[Int]): Boolean = {
//      val freqMap : mutable.HashSet[Int] = new mutable.HashSet[Int]()
//      boundary :
//      for (i <- nums){
//        if (freqMap.contains(i)){
//          break(true)
//        }
//        else freqMap.add(i)
//      }
//      false
//    }
//  }

  //Попытка в рекурссию
  //На LeetCode этот вариант дал результат по времени хуже примерно в 100 раз
  def startHasDuplicatesRec(nums : Array[Int]) : Boolean = {
    val set = new mutable.HashSet[Int]()
    hasDuplicatesRec(nums, set)
  }
  @tailrec
  def hasDuplicatesRec(nums : Array[Int], set : mutable.HashSet[Int]): Boolean = {
    if (!nums.isEmpty){
      if (set.contains(nums.head)){
        true
      }
      else{
        set.add(nums.head)
        hasDuplicatesRec(nums.tail, set)
      }
    }
    else false
  }

  //Попробуем через простое преобразование в HashSet
  //Работает немного дольше первого варианта
  def hasDuplicatesSet(nums : Array[Int]) : Boolean = {
    nums.toSet.size < nums.length
  }

}
