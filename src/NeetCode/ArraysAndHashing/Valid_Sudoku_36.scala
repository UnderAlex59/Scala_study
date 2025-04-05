package NeetCode.ArraysAndHashing

import scala.collection.mutable
object Valid_Sudoku_36 {
  def main(args: Array[String]): Unit = {

  }

  def isValidSudoku(board: Array[Array[Char]]): Boolean = {
    //Для каждого квадрата, вертикальной и горизонтальной строки создадим хранилища
    //При этом квадраты, вертикальные и горизонтальные строки также положим в свои хеш таблицы
    val square = mutable.HashMap[Int, mutable.HashSet[Int]]()
    val horizontal = mutable.HashMap[Int, mutable.HashSet[Int]]()
    val vertical = mutable.HashMap[Int, mutable.HashSet[Int]]()
    for (i <- 0 to 8){
      square.put(i, mutable.HashSet[Int]())
      horizontal.put(i, mutable.HashSet[Int]())
      vertical.put(i, mutable.HashSet[Int]())
    }
    var res : Boolean = true
    for (i <- 0 to(8); j <- 0 to(8)){
      val square_id: Int = (i / 3) * 3 + j/3
      val horizontal_id = i
      val vertical_id = j
      board(i)(j) match {
        case '.' =>
        case _ => {
          if (!square(square_id).add(board(i)(j).toInt)) res = false
          if (!horizontal(horizontal_id).add(board(i)(j).toInt)) res = false
          if (!vertical(vertical_id).add(board(i)(j).toInt)) res = false
        }
      }

    }
    res
  }

}
