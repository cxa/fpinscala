package fpinscala

object Exercise2_2 {

  def isSorted[A](as: Array[A], ordered: (A, A) => Boolean): Boolean = {

    def loop(n: Int, acc: Boolean): Boolean = {
      if (n >= as.length || !acc) acc
      else loop(n+1, ordered(as(n-1), as(n)))
    }

    loop(1, true)
  }

}
