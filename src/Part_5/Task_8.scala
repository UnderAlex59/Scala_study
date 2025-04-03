package Part_5

object Task_8 {
  def main(args: Array[String]): Unit = {

  }

  class Car (val maker_name : String, val model : String, val age : Int, var nubmer : String){

    def this(maker_name : String, model : String) {
      this(maker_name, model, -1, "")
    }

    def this(maker_name : String, model : String, age : Int) {
      this(maker_name, model,age, "")
    }


    def this(maker_name : String, model : String, number : String) {
      this(maker_name, model,-1, number)
    }

  }

}
