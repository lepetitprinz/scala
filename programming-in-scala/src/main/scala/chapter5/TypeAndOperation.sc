// Literals

// Integer literals
val hex = 0x5
val hex2 = 0x00FF
val magic = 0xcafebabe
val billion = 1_000_000_000

val dec = 31

val prog = 0XCAFEBABEL
val tower = 35L
val of = 31L

val little: Short = 367
val littler: Byte = 38

// Floating point literals
val big = 1.2345
val bigger = 1.2345e1
val biggerStill = 123e45
val trillion = 1_000_000_000e3

val little2 = 1.2345F
val littleBigger = 3e5f

val anotherDouble = 3e5
val yetAnother = 3e5D

// Character literals
val a = 'A'
val d = '\u0041'
val backslash = '\\'

// String literals
val hello = "hello"
val escapes = "\\\"\'"

// raw string
println(
  """Welcome to world.
    |Type "HELP" for help.
    |""".stripMargin)

// Boolean literals
val bool = true
val fool = false

// String interpolation
val name = "reader"
println(s"Hello, $name!")