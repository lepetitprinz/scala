package chapter4

import scala.collection.mutable

class CheckSumAccumulator:
  private var sum = 0
  def add(b: Byte): Unit = sum += b
  def checksum(): Int = ~(sum & 0xFF) + 1

// singleton object - companion object
object CheckSumAccumulator:
  private val cache = mutable.Map.empty[String, Int]
  def calculate(s: String): Int =
    if cache.contains(s) then
      cache(s)
    else
      val acc = new CheckSumAccumulator
      for c <- s do
        acc.add((c >> 8).toByte)
        acc.add(c.toByte)
      val cs = acc.checksum()
      cache += (s -> cs)
      cs