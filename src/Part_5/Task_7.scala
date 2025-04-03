package Part_5

object Task_7 {
  def main(args: Array[String]): Unit = {
    val person = new Person("Fred Smith")
    
  }

  class Person(name : String){
    val firstName: String = name.split(" ")(0)
    val lastName = name.split(" ")(1)
    print(s"$lastName $firstName")
  }

}
