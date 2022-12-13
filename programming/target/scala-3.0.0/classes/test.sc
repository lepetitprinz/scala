import scala.collection.mutable
import scala.math.BigDecimal

val n = 3
val m = 2
val k = 2

var scores = mutable.Map.empty[Int, Double]
for i <- 0 until m do
  val data = Array("3", "1.0", "2", "0.5", "1", "0.2")
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

