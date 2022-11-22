import chapter6.Rational

import javax.swing.JButton

//-----------//
// 1. Method
//-----------//
object Padding:  // Padding with a private padLine method
  def padLines(text: String, minWidth: Int): String =
    val paddedLines =
      for line <- text.linesIterator yield
        padLine(line, minWidth)
    paddedLines.mkString("\n")

  private def padLine(line: String, minWidth: Int): String =
    if line.length >= minWidth then line
    else line + " " * (minWidth - line.length)

val pad = Padding
val lineResult = pad.padLines("4", 4)
println(lineResult)

//--------------------//
// 2. Local functions
//--------------------//
def padLines(text: String, minWidth: Int): String =
  def padLine(line: String): String =
    if line.length >= minWidth then line
    else line + " " * (minWidth - line.length)

  val paddedLines =
    for line <- text.linesIterator yield
      padLine(line)
  paddedLines.mkString("\n")

//-------------------------//
// 3. First-class functions
//-------------------------//
val increase = (x: Int) => x + 1
increase(10)

val addTwo = (x: Int) =>
  val increment = 2
  x + increment
addTwo(10)

val someNumbers = List(-11, -10, -5, 0, 10)
someNumbers.foreach((x: Int) => println(x))

//--------------------//
// Placeholder syntax
//--------------------//
someNumbers.filter(x => x > 0)
someNumbers.filter(_ > 0)

val f = (_: Int) + (_: Int)
f(5, 10)

//-----------------------------//
// Partially applied functions
//-----------------------------//
def sum(a: Int, b: Int, c: Int) = a + b + c
sum(1, 2, 3) // 6

val s1 = sum(1, _, 3)
s1(2)

val s2 = sum
s2(10, 20, 30)

//----------//
// Closures
//----------//
val addMoreClosed = (x: Int) => x + 1 // closed term

var more = 1  // free variable
val addMoreOpen = (x: Int) => x + more  // open term
addMoreOpen(10)

more = 9999
addMoreOpen(10)

val someNumber = List(-11, -10, -5, 0, 5, 10)
var sum = 0
someNumber.foreach(sum += _)

def makeIncreaser(more: Int) = (x: Int) => x + more
val inc1 = makeIncreaser(1)
val inc9999 = makeIncreaser(9999)

inc1(10)
inc9999(10)

//-----------------------------//
// Special function call forms
//-----------------------------//
// Repeated parameters
def echo(args: String*): Unit =  // String* == Seq[String]
  for arg <- args do println(arg)

echo()
echo("one")
echo("hello", "world!")

val seq = Seq("What's", "up", "dock?")
echo(seq*)

// Named arguments
def speed(distance: Float, time: Float): Float = distance / time
speed(100, 10)
speed(distance=100, time=10)
speed(time=10, distance=100)

// Default parameter values
object Rational:
  def apply(numer: Int, denom: Int = 1) =
    new Rational(numer, denom)

def point(x: Int = 0, y: Int = 0) = (x, y)
point(x = 42)
point(y = 1000)

//-----------------------------------//
// SAM(Single Abstract Method) types
//-----------------------------------//
val button = new JButton()
button.addActionListener(
  _ => println("pressed!")
)

trait Increaser:
  def increase(i: Int): Int

def increaseOne(increaser: Increaser): Int =
  increaser.increase(1)

increaseOne(  // Java
  new Increaser:
    override def increase(i: Int): Int = i + 7
)
increaseOne(i => i + 7)  // Scala

//----------------//
// Tail recursion
//----------------//
"""
def approximate(guess: Double): Double =
  if isGoodEnough(guess) then guess
  else approximate(improve(guess))
"""