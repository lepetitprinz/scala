package chapter6

class Rational (n: Int, d: Int):
  require(d != 0) // Check preconditions

  private val g = gcd(n.abs, d.abs) // Private fields
  val numer: Int = n / g
  val denom: Int = d / g

  def this(n: Int) = this(n, 1)  // Auxiliary constructor

  def + (that: Rational): Rational =  // Define operator
    Rational(numer * that.denom + that.numer * denom, denom * that.denom)
  def + (i: Int): Rational =  // Method overloading
    Rational(numer + i * denom, denom)
  def - (that: Rational): Rational =
    Rational(numer * that.denom - that.numer * denom, denom * that.denom)
  def - (i: Int): Rational =  // Method overloading
    Rational(numer - i * denom, denom)
  def * (that: Rational): Rational =
    Rational(numer * that.numer, denom * that.denom)
  def * (i: Int): Rational =  // Method overloading
    Rational(numer * i, denom)
  def / (that: Rational): Rational =
    Rational(numer * that.denom, denom * that.numer)
  def / (i: Int): Rational =  // Method overloading
    Rational(numer, denom * i)

  override def toString = s"$numer/$denom" // Reimplementing the toString method

  private def gcd(a: Int, b: Int): Int = // Private method
    if b == 0 then a else gcd(b, a % b)

  // self references
  def lessThan(that: Rational) =
    this.numer * that.denom < that.numer * this.denom

  def max(that: Rational) =
    if this.lessThan(that) then that else this
