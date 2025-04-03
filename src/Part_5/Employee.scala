package Part_5
import scala.io.StdIn
import scala.math.BigDecimal.RoundingMode.HALF_UP

class Employee(){
  val name : String = "John Q. Public"
  var salary : Double = 0.0
}
object Main {
  def main(args: Array[String]): Unit = {
    val employee = new Employee
    println(employee.name)
    println(employee.salary)
    employee.salary_=(500)
    println(employee.salary)
  }


}
