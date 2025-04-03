package Part_2

import jdk.internal.util.xml.impl.Input

object Task_8 {
  def main(args: Array[String]): Unit = {
    println(product("Hello"))
  }

  def product(input: String): Long ={
    var res : Long = 1
    if (input.tail.isEmpty) input.head.toLong else input.head.toLong * product(input.tail)
  }
}
