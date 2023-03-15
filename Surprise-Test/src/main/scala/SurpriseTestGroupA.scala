import scala.jdk.Accumulator
//Square a list of integer and display the count of odd and even values in the list

object SurpriseTestGroupA extends App {
  def Square(number: List[Int], Length: Int, accumulator: Int): Unit = {

    if (accumulator != Length) {
      number(accumulator) = number(accumulator) * number(accumulator)
    }
    else
      Square(number, Length, accumulator + 1)

  }

  def EvenOddNumber(number: List[Int], accumulator: Int): String = {
    if (number[accumulator] % 2 == 0)
      even
    else
      odd
  }


  val number = List(1, 2, 3)
  Square(number, 3, 0)


}
