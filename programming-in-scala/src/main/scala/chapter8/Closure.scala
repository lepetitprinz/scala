package chapter8

class Closure {
  val addMoreClosed = (x: Int) => x + 1 // closed term

  var more = 1  // free variable
  val addMoreOpen = (x: Int) => x + more  // open term
  addMoreOpen(10)  //11

  more = 9999
  addMoreOpen(10)  // 10009

  val someNumbers = List(-11, -10, -5, 0, 5, 10)
  var sum = 0
  someNumbers.foreach(sum += _)  // -11
}
