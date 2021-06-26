package Cwiczenia2

object Zadanie4 {
  def promotion(salaries: Int, promotionFunction: Int=>Int) =promotionFunction(salaries)

  def smallPromotion(salaries: Int): Int = {
    salaries*2
  }

  def bigPromotion(salaries: Int):Int =
    salaries*4

  def hugePromotion(salaries: Int): Int =
    salaries*8

  def main(args: Array[String]): Unit = {
    println("Salary = 10")
    println(promotion(10,smallPromotion))
    println(promotion(10,bigPromotion))
    println(promotion(10,hugePromotion))


  }
}
