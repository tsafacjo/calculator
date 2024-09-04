package  test.util

import util.Subtraction

import org.scalatest.funsuite.AnyFunSuite

class SubtractionTest  extends AnyFunSuite {
    test("Subtraction should works"){
    val subtraction = new Subtraction(12, 34)
    assert(subtraction.process() == -22)

    }
    
  
}