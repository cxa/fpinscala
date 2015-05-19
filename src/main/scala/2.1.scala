package fpinscala

object Exercise2_1 {

  def fib(n: Int): Int = {

    @annotation.tailrec
    def loop(nth: Int, p1: Int, p2: Int): Int = {
      if (nth == 0) p1
      else loop(nth-1, p2, p1+p2)
    }

    loop(n, 0, 1)
  }

}
