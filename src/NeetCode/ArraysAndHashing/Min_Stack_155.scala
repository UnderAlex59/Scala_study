package NeetCode.ArraysAndHashing

class Min_Stack_155 {
  private val arr = scala.collection.mutable.ArrayBuffer[Int]()
  private var count_el : Int = 0
  private var min_el = scala.collection.mutable.Stack[Int]()
  def push(`val`: Int): Unit = {
    arr+=`val`
    if(count_el == 0) min_el.push(`val`)
    else{
      if(`val` <= min_el.top) min_el.push(`val`)
    }
    count_el+=1
  }

  def pop(): Unit = {
    count_el -=1
    if(arr.remove(count_el) == min_el.top){
      min_el.pop()
    }
  }

  def top(): Int = {
    arr(count_el-1)
  }

  def getMin(): Int = {
    min_el.top
  }
}
