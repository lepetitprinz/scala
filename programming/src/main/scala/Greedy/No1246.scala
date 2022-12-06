package Greedy

import scala.collection.mutable.ListBuffer

class No1246 {
  def main(args: Array[String]): Unit = {
    val nm = scala.io.StdIn.readLine() split " " take 2 map(_.toInt)
    val n = nm(0)
    val m = nm(1)

    val arr = ListBuffer[Int]()
    val range = 0 until m
    for i <- range do
      val num = scala.io.StdIn.readLine().toInt
      arr += num

    val arrSorted = arr.sorted

    var max_price = 0
    var max_sales = 0

    for i <- range do
      val sales = arrSorted(i) * math.min(n, m - i)
      if (sales > max_sales) then
        max_price = arrSorted(i)
        max_sales = sales

    printf("%d %d", max_price, max_sales)
  }
}
