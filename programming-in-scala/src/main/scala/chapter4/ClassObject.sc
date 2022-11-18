class CheckSumAccumulator:
  var sum = 0

val acc = new CheckSumAccumulator
val csa = new CheckSumAccumulator

acc.sum = 3
println(acc.sum)
println(csa.sum)

// private fields
class CheckSumAccumulator2:
  private var sum = 0

val accPrivate = new CheckSumAccumulator2
// accPrivate.sum = 5 Won't compile, because sum is private

class CheckSumAccumulator3:
  private var sum = 0
  def add(b: Byte): Unit =
    sum += b
  def checksum(): Int =
    return ~(sum & 0xFF) + 1

// More concise style
class CheckSumAccumulator4:
  private var sum = 0
  def add(b: Byte): Unit = sum += b
  def checksum(): Int = ~(sum & 0xFF) + 1

val acc4 = new CheckSumAccumulator4
acc4.add(100)
acc4.checksum()