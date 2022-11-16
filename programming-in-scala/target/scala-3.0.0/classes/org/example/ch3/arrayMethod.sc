val greetStrings = new Array[String](3)
greetStrings(0) = "Hello"
greetStrings(1) = ", "
greetStrings(2) = "world!"

for i <- 0 to 2 do
  print(greetStrings(i))

// Array(0) = "Other word" = Array.update(0, "Other word")
// Array(0) = Array.apply(o)
val greetStrings2 = new Array[String](3)
greetStrings2.update(0, "Hello")
greetStrings2.update(1, ", ")
greetStrings2.update(2, "world!")

for i <- 0 to 2 do
  print(greetStrings2.apply(i))

// Creating and initializing an array
val numNames = Array("zero", "one", "two")
val numNames2 = Array.apply("zero", "one", "two")