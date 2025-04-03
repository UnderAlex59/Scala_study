package Part_5

object Task_2 {
  def main(args: Array[String]): Unit = {
    val bankAccount = new BankAccount("Test Account")

    bankAccount.deposit(-8000)
    bankAccount.balance
    bankAccount.withdraw(5000)
    bankAccount.balance
    bankAccount.deposit(8000)
    bankAccount.balance
    bankAccount.withdraw(-1000)
    bankAccount.balance
    bankAccount.withdraw(3000)
    bankAccount.balance

  }

  class BankAccount (name : String){
    private[this] var balance_private : Double = 0

    def balance = {
      println(balance_private)
      balance_private
    }

    def deposit (value : Double) = {
      if (value >= 0 ) balance_private += value
      else println(s"Невозможно начислить на счёт отрицательную сумму ${value}.\nДля снятия средств воспользуйтесь методом withdraw")
    }

    def withdraw(value : Int)  = {
      if ( value > balance_private) {
        println (s"На счете ${name} недостаточно средств для снятия ${value}$$")
      } else if (value <= balance_private && value >= 0) {
        balance_private -= value
      }
      else {
        println (s"Невозможно снять со счета отрицательную сумму ${value}.\nДля начисления средств воспользуйтесь методом deposit")
      }
    }

  }

}
