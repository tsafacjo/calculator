package  core
abstract class Operator (val firstOperand:Any, val secondOperand:Any )  {
  def process():Any
}
