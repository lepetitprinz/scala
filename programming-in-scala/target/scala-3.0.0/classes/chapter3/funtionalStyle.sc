// Imperative style
def printArgs1(args: List[String]): Unit =
  var i = 0
  while i < args.length do
    println(args(i))
    i += 1

// Functional style
def printArgs2(args: List[String]): Unit =
  for arg <- args do
    println(arg)

def printArgs3(args: List[String]): Unit =
  args.foreach(println)

// More functional style (without side effects)
def formatArgs(args: List[String]) = args.mkString("\n")

println(formatArgs(List("abc", "def")))

// How to test
val res = formatArgs(List("zero", "one", "two"))
assert(res == "zero\none\ntwo")
