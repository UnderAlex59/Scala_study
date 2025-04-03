package Part_4
import java.io.File
import java.util.Scanner
import scala.collection.mutable
object Task_2 {
  def main(args: Array[String]): Unit = {
    val in = new Scanner(new File("D:\\Scala\\untitled\\src\\Part_4\\text.txt"))
    val word_freq = new mutable.LinkedHashMap[String, Int]()
    while (in.hasNext()){
      val word = in.next().replace(".", "").replace(",", "").replace(":", "")
      word_freq.put(word, word_freq.getOrElse(word, 0) +1)
    }
    println(word_freq)
  }
}
