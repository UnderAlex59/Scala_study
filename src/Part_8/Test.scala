package Part_8

class Test (val name : String) {
    def getInfo : String = "Helllo"
}

object Main extends App{
  val anonimClass = new Test("Fred"){
    def getAnotherInfo : String = "Hello, it's anonim class!"
  }

  println(anonimClass.getClass)
}