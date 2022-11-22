package chapter8

class PartiallyAppliedFunction {
  def sum(a: Int, b: Int, c: Int) = a + b + c
  sum(1, 2, 3) // 6

  val a = sum(_, _, _)
  a(1, 2, 3)

  val b = sum(1, _, 3)
  b(2)

  val c = sum _
  c(10, 20, 30)

  val d = sum
  d(10, 20, 30)
}
