val n = 5
val m = 4
val arr = List(2, 8, 10, 7)
val arrSorted = arr.sorted

var max_price = 0
var max_sales = 0
val range = 0 until m

for i <- range do
  val sales = arrSorted(i) * math.min(n, m - i)
  if (sales > max_sales) then
    max_price = arrSorted(i)
    max_sales = sales

printf("%d %d", max_price, max_sales)