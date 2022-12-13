package Sorting

import scala.collection.mutable
import scala.math.BigDecimal

object No2865 {
  def main(args: Array[String]): Unit = {
    val option = scala.io.StdIn.readLine() split " " take 3 map(_.toInt)
    val n = option(0)
    val m = option(1)
    val k = option(2)

    var scores = mutable.Map.empty[Int, Double]
    for i <- 0 until m do
      val data = scala.io.StdIn.readLine() split " "
      for j <- 0 until n do
        val person = data(j * 2).toInt
        val score = data(j * 2 + 1).toDouble

        if i == 0 then
          scores += (person -> score)
        else
          val max_score = scores(person)
          if score > max_score then
            scores += (person -> score)

    val max_scores = scores.values
    val result = max_scores.slice(0, k).sum
    val resultRoundUp = BigDecimal(result).setScale(1, BigDecimal.RoundingMode.HALF_UP).toDouble
    println(f"$resultRoundUp%.1f")
  }

}
