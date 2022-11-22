package chapter8

class TailRecursion {
  """
  def approximate(guess: Double): Double =
    if isGoodEnough(guess) then guess
    else approximate(improve(guess))
  """

  // Limits of tial recursion
  // If the recursion is indirect, as in the example of two mutually recursive functions , no optimization is possible
  def isEven(x: Int): Boolean =
    if x == 0 then true else isOdd(x - 1)

  def isOdd(x: Int): Boolean =
    if x == 0 then false else isEven(x - 1)

  // won’t get a tail-call optimization if the final call goes to a function value
  val funValue = nestedFun
  def nestedFun(x: Int): Unit =
    if x != 0 then
      println(x)
      funValue(x - 1)
}
