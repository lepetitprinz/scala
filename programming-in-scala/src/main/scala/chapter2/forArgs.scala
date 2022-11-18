package chapter2

@main def ForArgs(args: String*) =
  for arg <- args do
    println(arg)