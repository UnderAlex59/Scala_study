package NeetCode.ArraysAndHashing

object Valid_Parentheses_20 {
  def isValid(s: String): Boolean = {
    val symbolMap = scala.collection.mutable.HashMap[Char, Char](('}', '{'), (')', '('), (']', '['))
    val stack = scala.collection.mutable.ArrayStack[Char]()
    var res : Boolean = true

    for(char <- s){
      if(!symbolMap.keySet.contains(char)){
        stack.push(char)
      }
      else{
        if (stack.nonEmpty){
          if(stack.pop() != symbolMap(char)) {
            res = false
          }
        }
        else res = false
      }
    }
    if(stack.nonEmpty) res = false
    res
  }
}
