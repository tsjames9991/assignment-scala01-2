class Assignment {
  def showListWithIndex(number_list: List[Int]): Unit = {
    number_list.foreach(number => println(s"${number_list.indexOf(number)} = $number"))
  }

  def showMaximum(number_list: List[Int]): Int = {
    val head = number_list.head
    val tail = number_list.tail
    if (tail.isEmpty) head
    else {
      val temp = showMaximum(tail)
      if (head > temp) head else temp
    }
  }

  def calculateSumOfDigits(n: Int): Int = {
    if (n == 0)
      0
    else
      (n % 10) + calculateSumOfDigits(n / 10)
  }

  def calculateProductOfRange(n: Int): Int = {
    if (n == 1)
      1
    else
      n * calculateProductOfRange(n - 1)
  }

  def calculateFibonacci(n: Int): Int = {
    if (n < 2) n
    else calculateFibonacci(n - 1) + calculateFibonacci(n - 2)
  }

}

object Assignment extends App {
  val obj: Assignment = new Assignment
  val test_list = List(21, 34, 89, 12, 34, 51, -10)
  val input_for_range = 5
  val input_for_fibonacci = 4
  val temp = obj.calculateProductOfRange(input_for_range)
  obj.showListWithIndex(test_list)
  println(s"The Maximum In The List Is ${obj.showMaximum(test_list)}")
  println(s"The Sum of Digits : ${obj.calculateSumOfDigits(temp)}")
  println(s"The Product of Range : ${obj.calculateProductOfRange(input_for_range)}")
  println(s"The ${input_for_fibonacci}th Fibonacci Number : ${obj.calculateFibonacci(input_for_fibonacci)}")
}
