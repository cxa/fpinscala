import fpinscala.Exercise2_4._
import org.scalatest.FlatSpec

class Exercise2_4Test extends FlatSpec {

  def f(a: Int): Int => Int = b => a + b

  "f(a)(b)" should "be equal to f(a, b)" in {
    f(1)(2) == uncurry(f)(1, 2)
  }

}

