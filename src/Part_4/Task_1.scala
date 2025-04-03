package Part_4

object Task_1 {
  def main(args: Array[String]): Unit = {
    val arr = Map("Ноутбук" -> 50000, "Телефон" -> 25000, "Квартира" -> 10000000)
    val sale : scala.collection.Map[String, Double] = for ((k,v) <- arr) yield{
      (k, v* 0.9)
    }
    println(arr.mkString(", "))
    println(sale.mkString(", "))
  }

}
