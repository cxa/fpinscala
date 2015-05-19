import fpinscala.Exercise2_2._
import org.scalatest.FlatSpec

class Exercise2_2Test extends FlatSpec {

  def orderFunc(a: Int, b: Int): Boolean =  a < b
  
  val array = Array(1, 2, 3, 4, 5)
  array.mkString("Array(", ", ", ")") should "be sorted" in {
    isSorted(array, orderFunc)
  }

  val array2 = Array(1, 2, 3, 2, 6, 7)
  array2.mkString("Array(", ", ", ")") should "not be sorted" in {
    isSorted(array2, ordered = orderFunc)
  }

}

