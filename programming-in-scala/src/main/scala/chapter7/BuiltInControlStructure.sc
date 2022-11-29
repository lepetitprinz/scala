// If expressions
val args = Array("arg1", "arg2", "arg3")
var filename = "default.txt"
if !args.isEmpty then
  filename = args(0)
println(filename)

// idiom for conditional initialization
val filename2 =
  if !args.isEmpty then args(0)
  else "default.txt"

println(if (!args.isEmpty) args(0) else "default.txt")

// ------------//
// While loops
// ------------//
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

//-----------------//
// For expressions
//-----------------//
val filesHere = (new java.io.File(".")).listFiles
for file <- filesHere do
  println(file)

for i <- 1 to 4 do
  println(s"Iteration $i")

for i <- 1 until 4 do  // except upper bound
  println(s"Iteration $i")

// Filtering
// Finding .scala files using a for with a filter
val filesHere2 = (new java.io.File(".")).listFiles
for file <- filesHere2
  if file.getName.endsWith(".scala") do
    println(file)

for file <- filesHere2 do
  if file.getName.endsWith(".scala") then
    println(file)

// Using multiple filters in a for expression
for file <- filesHere2
  if file.isFile
  if file.getName.endsWith(".scala")
do println(file)

//-----------------//
// Nested iteration
//-----------------//
// Using multiple generators in a for expression
def fileLines(file: java.io.File) =
  scala.io.Source.fromFile(file).getLines().toArray

def grep(pattern: String) =
  for file <- filesHere2
    if file.getName.endsWith(".scala")
      line <- fileLines(file)
      if line.trim.matches(pattern) do
        println(s"$file: ${line.trim}")

grep(".*gcd.*")

// Mid-stream variables bindings
def grep2(pattern: String) =
  for file <- filesHere2
    if file.getName.endsWith(".scala")
      line <- fileLines(file)
      trimmed = line.trim
    do println(s"$file: $trimmed")

// Produce a new collection
def scalaFiles =
  for file <- filesHere2
    if file.getName.endsWith(".scala")
      yield file

// Transform an Array[File] to Array[Int]
val forLineLengths =
  for file <- filesHere2
    if file.getName.endsWith(".scala")
      line <- fileLines(file)
      trimmed = line.trim
      if trimmed.matches(".*for*")
        yield trimmed.length
  
//-----------------------------------------//
// Exception handling with try expressions
//-----------------------------------------//
// Throw exceptions
def half(n: Int) =
  if n % 2 == 0 then
    n / 2
  else
    throw new RuntimeException("n must be even")

// Catch exceptions
import java.io.FileReader
import java.io.FileNotFoundException
import java.io.IOException

try
  val f = new FileReader("input.txt")
  // use and clse file
catch
  case ex: FileNotFoundException => // Handle missing file
  case ex: IOException => // Handle other I/O error

// The finally clause
import java.io.FileReader
val file = new FileReader("input.txt")
try
  println(file.read())  // Use the file
finally
  file.close()  // Be sure to close the file

// Yield a value
import java.net.URL
import java.net.MalformedURLException

def urlFor(path: String) =
  try new URL(path)
  catch case e: MalformedURLException =>
    new URL("http://www.scala-lang.org")
    
//-------------------//
// Match expressions
//-------------------//
val firstArg = if !args.isEmpty then args(0) else ""
firstArg match
  case "salt" => println("pepper")
  case "chips" => println("salsa")
  case "eggs" => println("bacon")
  case _ => println("huh?")

// match expression that yields a value
val firstArg2 = if !args.isEmpty then args(0) else ""
val friend =
  firstArg2 match
    case "salt" => "pepper"
    case "chips" => "salsa"
    case "eggs" => "bacon"
    case _ => "huh?"
println(friend)

//----------------------------------//
// Looping without break or continue
//----------------------------------//
var i = 0
var foundIt = false

while i < args.length && !foundIt do
  if !args(i).startsWith("-") then
    if args(i).endsWith(".scala") then
      foundIt = true
    else
      i += 1
  else
    i += 1

// Recursive alternative to looping with vars
def searchFrom(i: Int): Int =
  if i >= args.length then -1
  else if args(i).startsWith("-") then searchFrom(i + 1)
  else if args(i).endsWith(".scala") then i
  else searchFrom(i + 1)
val cnt = searchFrom(0)

// Variable scope
def printMultiTable() =
  var i = 1
  // only i in score here
  while i <= 10 do
    var j = 1
    // both i and j in scope here
    while j <= 10 do
      val prod = (i * j).toString
      // i, j and prod in scope here
      var k = prod.length
      //i, j , prod, and k in scope here
      while k < 4 do
        print(" ")
        k += 1
      print(prod)
      j += 1
    // i and j still in scope; prod and k out of scope
    println()
    i += 1
  // i still in scope; j, prod, and k out of scope


val a = 1
if a == 1 then
  val a = 2
  println(a)
println(a)


// Refactoring imperative-style code
// Returns a row as a sequence
def makeRowSeq(row: Int) =
  for col <- 1 to 10 yield
    val prod = (row * col).toString
    val padding = " " * (4 - prod.length)
    padding + prod

// Returns a row as a string
def makeRow(row: Int) = makeRowSeq(row).mkString

// Returns table as a string with one row per line
def multiTable() =
  val tableSeq = // a sequence of row strings
    for row <- 1 to 10
      yield makeRow(row)
  tableSeq.mkString("\n")

val result = multiTable()
print(result)