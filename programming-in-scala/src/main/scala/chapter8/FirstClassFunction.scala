package chapter8

class FirstClassFunction {
  val increase = (x: Int) => x + 1

  val addTwo = (x: Int) =>
    val increment = 2
    x + increment

  val someNumbers = List(-11, -10, -5, 0, 10)
}

val fcf = FirstClassFunction()
val fcfIncrease = fcf.increase(10)
val fcfAddTwo= fcf.addTwo(10)
val result = fcf.someNumbers.foreach((x: Int) => println(x))
