package  test.util

import util.Multiplication

import org.scalatest.funsuite.AnyFunSuite

class MultiplicationTest  extends AnyFunSuite {
    test("Addition should works"){
    val multiplication = new Multiplication(12, 34)
    assert(multiplication.process() == 46)

    }
    
  
}