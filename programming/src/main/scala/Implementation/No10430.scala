package Implementation

object No10430 {
  def main(args: Array[String]): Unit = {
    val nums = scala.io.StdIn.readLine() split " " take 3 map(_.toInt)
    val a = nums(0)
    val b = nums(1)
    val c = nums(2)
    val check1 = (a + b) % c
    val check2 = ((a % c) + (b % c)) % c
    val check3 = (a * b) % c
    val check4 = ((a % c) * (b % c)) % c
    println(check1)
    println(check2)
    println(check3)
    println(check4)
  }
}
