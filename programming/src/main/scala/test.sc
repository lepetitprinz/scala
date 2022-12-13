import scala.collection.mutable
import scala.math.BigDecimal

var scores = mutable.Map.empty[String, Int]
scores += ("a" -> 1)
scores += ("b" -> 2)
scores += ("a" -> 3)

scores.values.sum