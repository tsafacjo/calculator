import scala.io.StdIn
import core.Operator
import util.Addition
import util.Multiplication
import util.Subtraction
import util.Division


@main def hello(): Unit =

  println("Welcome to the Scala Calculator!")

    // Ask the user for the first operand
    print("Enter the first number: ")
    val firstOperand = StdIn.readDouble()

    // Ask the user for the second operand
    print("Enter the second number: ")
    val secondOperand = StdIn.readDouble()

    // Ask the user which operation to perform
    println("Choose an operation: (+, -, *, /)")
    val operation = StdIn.readLine()

    // Instantiate the appropriate operation class based on user input
    val operator: Operator = operation match {
      case "+" => new Addition(firstOperand, secondOperand)
      case "-" => new Subtraction(firstOperand, secondOperand)
      case "*" => new Multiplication(firstOperand, secondOperand)
      case "/" => new Division(firstOperand, secondOperand)
      case _   => 
        println("Invalid operation selected.")
        return
    }
  val result = operator.process()
  println(s"result is $result")

def msg = "I was compiled by Scala 3. :)"
