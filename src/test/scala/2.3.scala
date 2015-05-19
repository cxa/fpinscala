import fpinscala.Exercise2_3._
import org.scalatest.FlatSpec

class Exercise2_3Test extends FlatSpec {

  def f(a: Int, b:Int) = a + b

  "f(a, b)" should "be equal to f(a)(b)" in {
    f(1, 2) == curry(f)(1)(2)
  }

}
