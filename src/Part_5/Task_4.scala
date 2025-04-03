package Part_5

object Task_4 {
  def main (args : Array[String]): Unit = {
    val time_1 : Time = new Time(14,30)
    val time_2 : Time = new Time(19,30)
    println(time_1.before(time_2))
    println(s"${time_1.hours}, ${time_1.minutes}")

  }

  class Time(hrs_in : Int, min_in : Int){

    private val min = (min_in + hrs_in*60) % (24*60-1)

    def hours = min/60

    def minutes = min%60

    def before (other : Time) : Boolean = {
      if (this.min < other.min) true
      else false
    }
  }
}
