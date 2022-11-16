import scala.io.StdIn.readLine

val n = 5
val rangeIncl = Range.inclusive(1, n).toList

import scala.collection.mutable.ListBuffer
def readData(args: List[Int]): List[Int] =
  val data = new ListBuffer[Int]()
  for i <- rangeIncl do
    data += i

  data.toList

val result = readData(rangeIncl)
print(result)

