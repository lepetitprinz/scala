package Sorting

object No10867 {
  def main(args: Array[String]): Unit = {
    val n = scala.io.StdIn.readLine().toInt
    val nums = scala.io.StdIn.readLine() split " " take n map(_.toInt)
    val numsSet = nums.toSet
    val numsList = numsSet.toList.sortWith(_ < _)
    val numsStr = numsList.mkString(" ")
    println(numsStr)
  }
}
