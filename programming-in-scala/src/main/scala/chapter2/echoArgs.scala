package org.example
package chapter2

@main def EchoArgs(args: String*) : Unit =
  var i = 0
  while i < args.length do
    if i != 0 then
      print(" ")
    print(args(i))
    i += 1
  println()


