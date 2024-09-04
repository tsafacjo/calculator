package  util
import core.Operator
class Multiplication(firstOperand:Any,  secondOperand:Any )  extends  Operator(firstOperand:Any,  secondOperand:Any ) {
  def process():Any={
  try {
    firstOperand.toString.toDouble + secondOperand.toString.toDouble
  } catch {
    case _: NumberFormatException => "Invalid operands. Both operands must be numeric."
  }
  }
}
