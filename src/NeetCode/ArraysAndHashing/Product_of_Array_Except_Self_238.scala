package NeetCode.ArraysAndHashing

object Product_of_Array_Except_Self_238 {
  def main (args : Array[String]) : Unit = {
    val arr = Array(-1,0,1,2,3)
    println(productExceptSelf(arr).mkString(" "))
  }

//Выполняется за 53 мс, но уже не использует оператора деления
  def productExceptSelf(nums: Array[Int]): Array[Int] = {
    val pref = scala.collection.mutable.ArrayBuffer[Int](1)
    val post = scala.collection.mutable.ArrayBuffer[Int](1)
    for (i <- 1 until nums.length){
      pref += nums(i-1) * pref(i-1)
      post += nums(nums.length-i) * post(i - 1)
    }
    val rev_post = post.reverse
    val res = scala.collection.mutable.ArrayBuffer[Int]()
    for (i <- nums.indices){
      res += pref(i)*rev_post(i)
    }
    res.toArray
  }
//Решение с оператором деления
  //Проверка занимает 35 мс
//  def productExceptSelf(nums: Array[Int]): Array[Int] = {
//    var zero_number = 0
//    var productAll = 1
//    var product_except_zero = 1
//    for (i <- nums){
//      if (i != 0){
//        productAll *= i
//        product_except_zero *= i
//      }
//      else if (i == 0){
//        if (zero_number == 0){
//          zero_number += 1
//          productAll *= i
//        }
//        else if (zero_number == 1){
//          productAll = 0
//          product_except_zero = 0
//        }
//      }
//    }
//    val res = scala.collection.mutable.ArrayBuffer[Int]()
//    for (i <- nums ){
//      (i -> zero_number) match {
//        case (0, 1) => res += product_except_zero
//        case (0, _) => res += 0
//        case (_, 0) => res += productAll/i
//        case (_, _) => res += 0
//        }
//      }
//    res.toArray
//    }
  }

