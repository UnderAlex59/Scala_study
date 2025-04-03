package Part_4

object Task_7 {
  def main(args: Array[String]): Unit = {
    var property = scala.collection.mutable.LinkedHashMap[String, String]("java.runtime.name" -> "Java(TM) SE Runtime Environment",
      "sun.boot.library.path" -> "/home/apps/jdk1.6.0_21/jre/lib/i386",
      "java.vm.version" -> "17.0b16",
      "java.vm.vendor" -> "Sun Microsystems Inc.",
      "java.vendor.url" -> "http://java.sun.com/",
      "path.separator" -> ":",
      "java.vm.name" -> "Java HotSpot(TM) Server VM")
    val max_key_length = property.keySet.max.length
    val max_value_length = property.values.max.length
    println("_"*(max_value_length+max_key_length)*2)
    for ((k,v) <- property){
      println(s"$k${" " * (max_key_length - k.length)}|$v${" " * (max_value_length - v.length)}")
    }
    println("_"*(max_value_length+max_key_length)*2)
  }
}
