import fpinscala.Exercise2_1._
import org.scalatest.FlatSpec

class Exercise2_1Test extends FlatSpec {

  behavior of "Fibonacci"
  
  it should "be 0 for 0th item" in {
    assert(fib(0) == 0)
  }

  it should "be 1 for 1st item" in {
    assert(fib(1) == 1)
  }

  it should "be 5 for 5th item" in {
    assert(fib(5) == 5)
  }

  it should "be 8 for 6th item" in {
    assert(fib(6) == 8)
  }

}


