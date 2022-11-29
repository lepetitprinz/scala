package chapter7

class WhileLoop {
  // imperative style
  def gcdLoop(x: Long, y: Long): Long =
    var a = x
    var b = y
    while a != 0 do
      val temp = a
      a = b % a
      b = temp
    b
  
  // functional style
  def gcd(x: Long, y: Long): Long =
    if y == 0 then x else gcd(y, x % y)
}
