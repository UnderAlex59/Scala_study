package NeetCode.ArraysAndHashing

object Encode_and_Decode_Strings {
  def main(args: Array[String]): Unit = {
    val str_arr = Array("neet","code","love","you")
    val encode_str = encode(str_arr)
    println(encode_str)
    val decode_str = decode(encode_str)
    println(decode_str.mkString(" "))
  }

  def encode(strs : Array[String]) : String = {
    val strBuilder = new StringBuilder()
    for (i <- strs){
      strBuilder.append(i.length).append("#").append(i)
    }
    strBuilder.mkString
  }

  def decode(str : String) : Array[String] = {
    val str_arr = scala.collection.mutable.ArrayBuffer[String]()
    var len : Int = 0
    val builder = new StringBuilder()
    var status : Boolean = false
    for(i <- str){
      i match {
        case '#' => {
          status = true
          len = builder.mkString.toInt
          builder.clear()
        }
        case _ => {
          if (status && len > 0){
            builder.append(i)
            len -= 1
            if (len == 0){
              status = false
              str_arr += builder.mkString
              builder.clear()
            }
          }
          else {
            builder.append(i)
          }
        }
      }
    }
    str_arr.toArray
  }

}
