package chapter7

class ForLoop {
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
}
