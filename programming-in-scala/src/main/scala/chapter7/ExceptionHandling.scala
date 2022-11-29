package chapter7

import java.io.FileReader
import java.io.FileNotFoundException
import java.io.IOException
import java.net.URL
import java.net.MalformedURLException

// Exception handling with try expressions
class ExceptionHandling {
  // Throw exceptions
  def half(n: Int) =
    if n % 2 == 0 then
      n / 2
    else
      throw new RuntimeException("n must be even")
  
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
  def urlFor(path: String) =
    try new URL(path)
    catch case e: MalformedURLException =>
      new URL("http://www.scala-lang.org")
}
