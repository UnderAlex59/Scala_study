package NeetCode.ArraysAndHashing


import scala.collection.mutable
object Longest_Consecutive_Sequence_128 {

  def main (args : Array[String]) : Unit = {
    val test_arr = mutable.ArrayBuffer(0,3,2,5,4,6,1,1).toArray
    println(longestConsecutive(test_arr))
  }


    def longestConsecutive(nums: Array[Int]): Int = {
      if (!nums.isEmpty){
        val set = nums.toSet
        var max_len : Int = 0
        var temp_len : Int = 0
        for (i <- set){
          if (!set.contains(i-1)){
            var cur : Int = i
            while(set.contains(cur)){
              cur += 1
              temp_len +=1
            }
            if (temp_len > max_len) max_len = temp_len
            temp_len = 0
          }
        }
        max_len
      }
      else 0
  }

}
