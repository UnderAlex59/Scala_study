package Part_5

import scala.beans.BeanProperty

object Task_5 {
  def main(args: Array[String]): Unit = {

  }


  class Student (@BeanProperty var name : String, @BeanProperty var id : Long)
}

