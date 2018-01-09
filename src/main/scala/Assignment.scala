class Assignment{
  def showListWithIndex(numberlist: List[Int]): Unit ={
    numberlist.foreach( number => println(s"${numberlist.indexOf(number)} = ${number}") )
  }

  def showMaximum(numberlist: List[Int]): Int = {
    val head = numberlist.head
    val tail = numberlist.tail
    if(tail.isEmpty) head
    else{
      val temp = showMaximum(tail)
      if(head > temp) head else temp
    }
  }

  def calculateSumOfRange(n: Int): Int = {
    if(n == 0)
      0
    else
      n + calculateSumOfRange(n - 1)
  }

  def calculateProductOfRange(n: Int): Long = {
    if(n == 1)
      1
    else
      n * calculateProductOfRange(n - 1)
  }

  def calculateFibonacci(n: Int): Int = {
    if(n < 2) n
    else calculateFibonacci(n - 1) + calculateFibonacci(n - 2)
  }

}

object Assignment extends App {
  val obj : Assignment = new Assignment
  val test_list = List[Int](21,34,89,12,34,51)
  val input_for_range = 15
  val input_for_fibonacci = 10
  obj.showListWithIndex(test_list)
  println(s"The Maximum In The List Is ${obj.showMaximum(test_list)}")
  println(s"The Sum of Range : ${obj.calculateSumOfRange(input_for_range)}")
  println(s"The Product of Range : ${obj.calculateProductOfRange(input_for_range)}")
  println(s"The ${input_for_fibonacci}th Fibonacci Number : ${obj.calculateFibonacci(input_for_fibonacci)}")
}
