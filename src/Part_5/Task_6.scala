package Part_5

object Task_6 {
  def main(args: Array[String]): Unit = {
    val person = new Person(50)
    println(person.age)
  }

  class Person(age_in : Int){
    var age : Int = if (age_in>=0) age_in else 0
  }

}
