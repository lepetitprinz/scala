package org.example
package chapter2

@main def LoopWithWhile(args: String*): Unit =
  var i = 0
  while i < args.length do
    println(args(i))
    i += 1
