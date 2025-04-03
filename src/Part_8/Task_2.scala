package Part_8
import Part_8.Task_1
object Task_2 {
  def main(args: Array[String]): Unit = {
    val acc = new SavingAccount(100)
    println(acc.currentBalance)
    println(acc.deposit(100))
    println(acc.withdrow(100))
    println(acc.deposit(100))
    println(acc.withdrow(100))
    println(acc.deposit(100))
  }

  class SavingAccount(initialBallance : Double) extends BankAccount(initialBallance){
    private var balance = initialBallance
    private var countFree = 3
    def earnMonthlyInterest = {
      balance *= 1.10
      countFree = 3
    }

    override def deposit(amount: Double): Double = {
      if (countFree == 0){
        balance += (amount-1)
        balance
      }
      else{
        balance += amount
        countFree -= 1
        balance
      }
    }

    override def withdrow(amount: Double): Double = {
      if (countFree == 0){
        balance -= (amount +1)
        balance
      }
      else {
        balance -= amount
        countFree -= 1
        balance
      }
    }
  }

}
