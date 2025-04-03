package Part_9

object Task_2 {
  def main(args: Array[String]): Unit = {
    for (elem <- "\\w\\w\\w\\w\\w\\w\\w\\w\\w\\w\\w\\w+".r.
      findAllIn(scala.io.Source.fromFile("src/Part_9/reverse_Example.txt").getLines().toArray.mkString(" "))) {println(elem)}
  }

}
