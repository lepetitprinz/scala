class Rational1(n: Int, d: Int):
  println(s"Created $n / $d")

new Rational(1, 2)

// Reimplementing the toString method
class Rational2(n: Int, d: Int):
  override def toString = s"$n/$d"

val x = new Rational2(1, 3)
val y = new Rational2(5, 7)

// Check preconditions
class Rational3(n: Int, d: Int):
  require(d != 0)
  override def toString = s"$n/$d"

val z = new Rational3(1, 0)

class Rational (n: Int, d: Int):
  require(d != 0) // Check preconditions

  private val g = gcd(n.abs, d.abs) // Private fields
  val numer: Int = n / g
  val denom: Int = d / g

  def this(n: Int) = this(n, 1) // Auxiliary constructor

  def + (that: Rational): Rational = // Define operator
    Rational(numer * that.denom + that.numer * denom, denom * that.denom)
  def + (i: Int): Rational = // Method overloading
    Rational(numer + i * denom, denom)
  def - (that: Rational): Rational =
    Rational(numer * that.denom - that.numer * denom, denom * that.denom)
  def - (i: Int): Rational =
    Rational(numer - i * denom, denom)
  def * (that: Rational): Rational =
    Rational(numer * that.numer, denom * that.denom)
  def * (i: Int): Rational =
    Rational(numer * i, denom)
  def / (that: Rational): Rational =
    Rational(numer * that.denom, denom * that.numer)
  def / (i: Int): Rational =
    Rational(numer, denom * i)

  override def toString = s"$numer/$denom" // Reimplementing the toString method

  private def gcd(a: Int, b: Int): Int = // Private method
    if b == 0 then a else gcd(b, a % b)

  // self references
  def lessThan(that: Rational) =
    this.numer * that.denom < that.numer * this.denom

  def max(that: Rational) =
    if this.lessThan(that) then that else this

val x1 = Rational(1, 2)
val y1 = Rational(2, 3)
val z1 = 2
x1 + y1
x1 + x1 * y1
(x1 + x1) * y1
x1 + (x1 * y1)

x1 + z1
x1 * z1
