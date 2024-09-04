package  test.util

import util.Addition

import org.scalatest.funsuite.AnyFunSuite

class TestAddition  extends AnyFunSuite {
    test("Addition should works"){
    val addition = new Addition(12, 34)
    assert(addition.process() == 46)

    }
    
  
}