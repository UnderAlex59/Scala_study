package NeetCode.ArraysAndHashing


import scala.collection.mutable
object Top_K_Frequent_Elements_347 {
  def main(args: Array[String]): Unit = {
    val nums = Array(1,1,1,2,2,3333)
    println(topKFrequent(nums, 2).mkString(" "))
  }

  def topKFrequent(nums: Array[Int], k: Int): Array[Int] = {
    val freq = new Array[Int](20001)
    val res = mutable.ArrayBuffer[mutable.ArrayBuffer[Int]](new mutable.ArrayBuffer[Int])
    for(i <- nums){
      freq(i+10000) += 1
      if (res.size >= freq(i+10000)){
        res(freq(i+10000)-1) += i
      }
      else{
        res += mutable.ArrayBuffer(i)
      }

    }
    var out = mutable.ArrayBuffer[Int]()
    for(i <- res.reverse){
      if (i.size == k){
        out = i
      }
    }
    out.toArray
  }
}
