package Part_11

object Task_8 {
  def main(args: Array[String]): Unit = {
    val matrix : Matrix = new Matrix(3,4, 6)
    val matrix_2 = new Matrix(4,3,2)
    val res = matrix * 10
    val res2 = res + matrix
    val res3 = matrix * matrix_2
    res3(1,1) = 5

    for (i <- matrix.arr.indices){
      println(res3.arr(i).mkString(", "))
    }
  }


  class Matrix(val m : Int, val n : Int) extends AnyRef{
    val arr: Array[Array[Int]] = Array.ofDim[Int](m,n)

    def this(m : Int, n : Int, x : Int){
      this(m,n)
      for (i <- 0 until m; j <- 0 until n){
        arr(i)(j) = x
      }
    }

    def apply(m : Int)(n : Int) : Int = {
      this.arr(m)(n)
    }

    def +(that : Matrix) : Matrix ={
      if (this.m == that.m && this.n == that.n){
        val res : Matrix = new Matrix(this.m, this.n)
        for (i <- 0 until(m); j <- 0 until(n)){
          res.arr(i)(j) = this(i)(j) + that(i)(j)
        }
        res
      }
      else throw new Exception("Невозможно сложить матрицы, разные размеры")
    }

    def *(that : Matrix): Matrix ={
      if (this.n == that.m){
        val res : Matrix = new Matrix(this.m, that.n)
        for (i <- 0 until(res.m); j <- 0 until res.n){
          for (k <- 0 until(that.n)){
            res.arr(i)(j) = res(i)(j) + this(k)(i)*that(j)(k)
          }
        }
        res
      }
      else throw new Exception("Недопустимая размерность матриц")
    }

    def *(x : Int) : Matrix = {
      val res : Matrix = new Matrix(this.m, this.n)
      for (i <- 0 until(this.m); j <- 0 until(this.n)){
        res.arr(i)(j) = this(i)(j)*x
      }
      res
    }

    def update(m : Int, n : Int, value : Int): Unit = {
      this.arr(m)(n) = value
    }
  }
}
