package NeetCode.ArraysAndHashing

import scala.collection.mutable

object TwoSum_1 {
  def main(args: Array[String]): Unit = {
    val arr = Array(3,3)
    println(twoSum(arr, 6).mkString(" "))
  }

  def twoSum(nums: Array[Int], target: Int): Array[Int] = {
    val res = new Array[Int](2)
    val map = new mutable.HashMap[Int, Int]
    for (i <- nums.indices){
      if (map.contains(target - nums(i))){
        res(0) = i
        res(1) = map(target - nums(i))
        return res.sorted
      }
      else map.put(nums(i), i)
    }
    res
  }
}
