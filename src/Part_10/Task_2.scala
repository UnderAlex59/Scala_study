package Part_10
//. Определите класс OrderedPoint, подмешав scala.math.Ordered
//  [Point] в java.awt.Point. Используйте лексикографическое упорядочение, то есть (x, y) < (x′, y′), если x < x′ или x = x′ и y < y′

import java.awt.Point

import scala.math.Ordered

object Task_2{
  def main(args: Array[String]): Unit = {
    val p1 = new OrderedPoint(10, 20)
    val p2 = new OrderedPoint(20, 20)
    val p3 = new OrderedPoint(10, 30)
    val p4 = new OrderedPoint(10, 20)
    val p5 = new OrderedPoint(5,10)
    println(p1.compare(p2))
    println(p1.compare(p3))
    println(p1.compare(p4))
    println(p4.compare(p2))
    println(p2.compare(p3))
    println(p1.compare(p5))





  }


  class OrderedPoint(x : Int, y : Int)  extends Point(x,y) with Ordered[Point]{
    override def compare(that: Point): Int = {
      if ((this.x < that.x) || (this.x == that.x && this.y < that.y)) -1
      else if ((this.x == that.x) && (this.y == that.y)) 0
      else 1
    }
  }

}
