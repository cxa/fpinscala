import fpinscala.Exercise2_5._
import org.scalatest.FlatSpec

class Exercise2_5Test extends FlatSpec {

  def f1(a: Int) = a - 1

  def f2(b: Int) = b / 10

  "compose(f1, f2)" should "be equal to f1(f2(a))" in {
    compose(f1, f2)(100) == f1(f2(100))
  }

}

