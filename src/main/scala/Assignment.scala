class Assignment{
  def showListWithIndex(numberlist: List[Int]): Unit ={
    numberlist.foreach( number => println(s"${numberlist.indexOf(number)} = ${number}") )
  }

  def showMaximum(numberlist: List[Int]): Int = {
    var maximum = numberlist(0)
    numberlist.foreach {
      temp => if(maximum < temp) {
        maximum = temp}
    }
    maximum
  }

  def calculateSumOfRange(n: Int): Int = {
    val range = 1 to n
    var sum = 0
    for(i <- range) yield { sum = sum + i }
    sum
  }

  def calculateProductOfRange(n: Int): Long = {
    val range = 1 to n
    var product: Long  = 1
    for(i <- range) yield { product = product * i }
    product
  }

  def calculateFibonacci(n: Int): Int = {
    if(n < 2) n
    else calculateFibonacci(n - 1) + calculateFibonacci(n - 2)
  }

}

object Assignment extends App {
  val obj : Assignment = new Assignment
  val testlist = List[Int](21,34,89,12,34,51)
  val inputforrange = 15
  val inputforfibonacci = 10
  obj.showListWithIndex(testlist)
  println(s"The Maximum In The List Is ${obj.showMaximum(testlist)}")
  println(s"The Sum of Range : ${obj.calculateSumOfRange(inputforrange)}")
  println(s"The Product of Range : ${obj.calculateProductOfRange(inputforrange)}")
  println(s"The ${inputforfibonacci}th Fibonacci Number : ${obj.calculateFibonacci(inputforfibonacci)}")
}
