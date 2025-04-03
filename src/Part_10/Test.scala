package Part_10
//Хотел скомпилировать класс и посмотреть, как его восстановит javap по байт-коду
//И правда в класс Test просто добавилось поле из трэйта Test_tr со всеми методами доступа
class Test extends Test_tr {
  val num = 10
  def printer() : Unit = println(const)


}
trait Test_tr {
  val const = 15
  def trait_printer = println("I am trait")
}
