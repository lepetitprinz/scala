package chapter4

import CheckSumAccumulator.calculate

object ScalaApp:
  def main(args: Array[String]): Unit =
    for arg <- args do
      println(arg + ": " + calculate(arg))