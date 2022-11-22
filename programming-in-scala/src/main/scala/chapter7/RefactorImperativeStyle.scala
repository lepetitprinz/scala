package chapter7

class RefactorImperativeStyle {
  // Imperative Style
  def printMultiTable(): Unit =
    var i = 1
    while i <= 10 do
      var j = 1
      while j <= 10 do
        val prod = (i * j).toString
        var k = prod.length
        while k < 4 do
          print(" ")
          k += 1
        print(prod)
        j += 1
      println()
      i += 1

  // Functional Style
  def multiTable(): String =  // Returns table as a string with one row per line
    val tableSeq = // a sequence of row strings
      for row <- 1 to 10
        yield makeRow(row)
    tableSeq.mkString("\n")
  
  private def makeRowSeq(row: Int) =
    for col <- 1 to 10 yield
      val prod = (row * col).toString
      val padding = " " * (4 - prod.length)
      padding + prod

  // Returns a row as a string
  private def makeRow(row: Int) = makeRowSeq(row).mkString
  
}
