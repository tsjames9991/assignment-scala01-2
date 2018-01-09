def calculateProductOfRange(n: Int): Long = {
  val range = 1 to n
  var product: Long  = 1
  for(i <- range) yield { product = product * i }
  product
}

calculateProductOfRange(5)