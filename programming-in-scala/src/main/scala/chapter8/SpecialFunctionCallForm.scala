package chapter8

import chapter6.Rational

class SpecialFunctionCallForm {
  // Repeated parameters
  def echo(args: String*): Unit = // String* == Seq[String]
    for arg <- args do println(arg)

  echo()
  echo("one")
  echo("hello", "world!")

  val seq: Seq[String] = Seq("What's", "up", "dock?")
  echo(seq *) // asterisk notation tells the compiler to pass each element of seq as its own argument

  // Named arguments
  def speed(distance: Float, time: Float): Float = distance / time

  speed(100, 10) // 10.0
  speed(distance = 100, time = 10) // 10.0
  speed(time = 10, distance = 100) // 10.0

  // Default parameter values
  object Rational:
    def apply(numer: Int, denom: Int = 1) =
      new Rational(numer, denom)
}