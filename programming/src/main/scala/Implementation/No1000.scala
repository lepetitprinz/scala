package Implementation

object No1000 {
  def main(args: Array[String]): Unit = {
    val num = (scala.io.StdIn.readLine() split " " take 2 map(_.toInt))
    println(num(0) + num(1))
  }
}
