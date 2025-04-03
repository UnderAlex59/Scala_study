package Part_11

//Определите операцию unapply для класса RichFile, извлекающую путь к файлу, имя и расширение. Например, файл /home/
//  cay/readme.txt имеет путь /home/cay, имя readme и расширение
//  txt.
object Task_9 {
  def main(args : Array[String]): Unit = {
    val test : RichFile = new RichFile("/home/cay/readme.txt")
    val RichFile(path, name, format) = test

    println(s"Путь: $path\nИмя: $name\nРасширение $format")
  }
}
class RichFile (val absolutePath : String){

}

object RichFile{
  def unapply(that : RichFile): Option[(String, String, String)] = {
    if (that.absolutePath.contains(".")&&(that.absolutePath.count(p => p.equals('.') )> 1)){
      None
    }
    else {
      if (that.absolutePath.contains("/")){
        val last_id = that.absolutePath.lastIndexOf("/")
        val dot_Id = that.absolutePath.indexOf(".")
        Some(that.absolutePath.substring(0, last_id), that.absolutePath.substring(last_id+1, dot_Id), that.absolutePath.substring(dot_Id+1))
      }
      else{
        val dot_Id = that.absolutePath.indexOf(".")
        Some("", that.absolutePath.substring(0, dot_Id), that.absolutePath.substring(dot_Id+1))
      }
    }
  }
}