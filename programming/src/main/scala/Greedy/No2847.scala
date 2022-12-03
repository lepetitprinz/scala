package Greedy

import scala.collection.mutable.ListBuffer

class No2847 {
  def main(args: Array[String]): Unit = {
    val n = scala.io.StdIn.readLine().toInt
    val data = ListBuffer[Int]()
    val range = 0 to n
    for i <- range do
      val num = scala.io.StdIn.readLine().toInt
      data += num
  }

}
