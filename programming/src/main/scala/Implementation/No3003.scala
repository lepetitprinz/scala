package Implementation

object No3003 {
  def main(args: Array[String]): Unit = {
    val org = List(1, 1, 2, 2, 2, 8)
    val curr = (scala.io.StdIn.readLine() split " " take 6 map(_.toInt)).toList
    val zipData = org zip curr
    val result = (for data <- zipData yield data(0) - data(1)).mkString(" ")
    println(result)
  }
}
