// Operators

val sum = 1 + 2
val sumMore = 1.+(2)
val longSum = 1 + 2L

// String method: indexOf
val s = "Hello, world"
s indexOf 'o'
s.indexOf('o')

// prefix notation
-2.0
(2.0).unary_-

// post notation
val s2 = "Hello, world"
s2.toLowerCase

import scala.language.postfixOps
s2 toLowerCase

// Arithmetic operations
1.2 + 2.3
3 - 1
'b' - 'a'
2L * 3L
11 / 4
11 % 4
11.0f / 4.0f
11.0 % 4.0

// Relational and logical operations
1 > 2
1.0 <= 1.0
3.5f >= 3.6f
'a' >= 'A'
val untrue = !true

// logical method
val toBe = true
val question = toBe || !toBe
val paradox = toBe && !toBe

def salt() = {println("salt"); false}
def pepper() = {println("pepper"); true}

pepper() && salt()
salt() && pepper()

// Bitwise operations
1 & 2
1 | 2
1 ^ 3
~1

-1 >> 31
-1 >>> 31
1 << 2

// Object equality
1 == 2
1 != 2

List(1, 2, 3) == List(1, 2, 3)
List(1, 2, 3) == List(4, 5, 6)

1 == 1.0
List(1, 2, 3) == null  // compare against null

// Operator precedence
0.max(5)
0.min(5)
-2.7.abs
-2.7.round
1.5.isInfinity
(1.0/0).isInfinity
4 to 6
"bob".capitalize
"robert".drop(2)

List(1, 2, 3).max