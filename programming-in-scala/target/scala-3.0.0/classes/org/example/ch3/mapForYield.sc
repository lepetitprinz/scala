val adjectives = List("One", "Two", "Red", "Blue")
val nouns = adjectives.map(adj => adj + " Fish")

val nouns2 =
  for adj <- adjectives yield
    adj + " Fish"

val lengths = nouns.map(noun => noun.length)
val lengths2 =
  for noun <- nouns yield
    noun.length

// Vector
val ques = Vector("Who", "What", "When", "Where", "Why")
val usingMap = ques.map(q => q.toLowerCase + "?")
val usingForYield =
  for q <- ques yield
    q.toLowerCase + "?"

val startsW = ques.find(q => q.startsWith("W"))
val startsH = ques.find(q => q.startsWith("H"))
val hasLen4 = ques.find(q => q.length == 4)

startsW.map(word => word.toUpperCase)
for word <- startsW yield word.toUpperCase
