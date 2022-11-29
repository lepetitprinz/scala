package chapter8

class PlaceholderSyntax {
  val someNumbers = List(-11, -10, -5, 0, 10)

  someNumbers.filter(x => x > 0)
  someNumbers.filter(_ > 0)  // Placeholder syntax

  val f = (_: Int) + (_: Int)
  f(5, 10)
}
