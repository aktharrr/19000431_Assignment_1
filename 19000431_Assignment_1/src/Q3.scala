object Q3 extends App{
  val copies = 60
  val coverPrice = 24.95
  val discount = 40.0/100.0

  def shippingCost(noOfBooks:Int):Double = {
    if (noOfBooks <= 50) 3.0
    else 3.0 + (0.75 * (noOfBooks - 50))
  }

  def calculateDiscount(coverPrice:Double ,numberOfCopies:Int, discount:Double):Double = {
    coverPrice * numberOfCopies * discount
  }

  def calculateWholesaleCost(numberOfCopies:Int ,coverPrice:Double,discount:Double):Double = {
    ( (numberOfCopies * coverPrice) - calculateDiscount(coverPrice,numberOfCopies,discount) + shippingCost(numberOfCopies))
  }

  val wholeSaleValue = calculateWholesaleCost(copies,coverPrice,discount)
  print("Total Wholesale Cost = ")
  println(f"$wholeSaleValue%1.2f") // round off the value into 2 decimal place
}
