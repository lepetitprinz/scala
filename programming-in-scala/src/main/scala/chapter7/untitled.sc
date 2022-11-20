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

// While loops
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

// For expressions
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

// Nested iteration
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

// Exception handling with try expressions
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