package Part_4
import java.io.File
import java.util.Scanner
import scala.collection.immutable
object Task_4 {
  def main(args: Array[String]): Unit = {
    val in = new Scanner(new File("D:\\Scala\\untitled\\src\\Part_4\\text.txt"))
    var word_freq = new immutable.TreeMap[String, Int]()
    while (in.hasNext()){
      val word = in.next().replace(".", "").replace(",", "").replace(":", "")
      val temp_freq = word_freq.getOrElse(word, 0)
      word_freq -= word
      word_freq += ((word, temp_freq+1))
    }
    println(word_freq)
  }
}
