package Part_8

import com.sun.tools.javac.comp.DeferredAttr.AttrMode

object Task_1 {
  def main(args: Array[String]): Unit = {
    val chekinhAccount = new CheckingAccount(100)
    println(chekinhAccount.deposit(100))
    println(chekinhAccount.withdrow(99))
  }



}
class BankAccount(initialBallance : Double){
  private[BankAccount] var balance = initialBallance
  def currentBalance = balance
  def deposit(amount : Double) = {
    balance+= amount
    balance
  }
  def withdrow(amount : Double) = {
    balance -= amount
    balance
  }

}
class CheckingAccount(initialBallance : Double) extends BankAccount(initialBallance){
  private[this] var balance = initialBallance
  override def deposit(amount: Double): Double = {balance += (amount-1); balance}

  override def withdrow(amount: Double): Double = {
    balance -= (amount +1)
    balance
  }
}
