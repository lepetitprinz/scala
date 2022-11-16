package org.example
package ch2

@main def ForArgs(args: String*) =
  for arg <- args do
    println(arg)