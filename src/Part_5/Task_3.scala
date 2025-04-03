package Part_5

object Task_3 {
  def main (args : Array[String]): Unit = {
    val time_1 : Time = new Time(14,30)
    val time_2 : Time = new Time(19,30)
    println(time_1.before(time_2))

  }

  class Time(hrs_in : Int, min_in : Int){

    private [this] val hrs = hrs_in%24
    private[this] val min = min_in%60
    def hours = hrs

    def minutes = min

    def before (other : Time) : Boolean = {
      if (this.hours < other.hours) true
      else if (this.hours.equals(other.hours) && this.minutes < other.minutes) true
      else false
    }
  }
}
