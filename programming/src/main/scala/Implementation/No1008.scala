package Implementation

object No1008 {
  def main(args: Array[String]): Unit = {
    val nums = scala.io.StdIn.readLine() split " " take 2 map(_.toDouble)
    println(nums(0) / nums(1))
  }
}
