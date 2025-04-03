package Part_9

object Task_1 {
  def main(args: Array[String]): Unit = {
    val writer = new java.io.PrintWriter("src/Part_9/reverse_Example.txt")
    for (i <- scala.io.Source.fromFile("src/Part_9/Example5.txt").getLines().toArray.reverse) writer.println(i)

    writer.close()

  }

}
