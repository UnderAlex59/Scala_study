package Part_2

object Task_10 {
  def main(args: Array[String]): Unit = {
    print(pow(2, 16))
  }

  def pow(x : Float, n : Int): Float ={
    if (n == 0) 1 else if (n == 1) x else if (n < 0) n_negative(x,n) else if (n % 2 == 0) n_even(x, n) else n_odd(x, n)
  }

  def n_even(x : Float, n : Int): Float = {
    if (n == 2) x*x
    else pow(pow(x, n/2), 2)
  }

  def n_odd (x: Float, n : Int): Float ={
    x * pow(x, n-1)
  }

  def n_negative (x : Float, n :Int): Float ={
    1/(pow(x, -n))
  }

}
