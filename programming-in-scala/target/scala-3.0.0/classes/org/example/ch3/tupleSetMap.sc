// Tuple Method
val pair = (99, "Luftballons")
val num: Int = pair(0)
val what: String = pair(1)

//------
// Sets
//------

// Creat, initialize and use an immutable set
var jetSet = Set("Boeing", "Airbus")
jetSet += "Lear"
println(jetSet)
val query = jetSet.contains("Cessna")

// Mutable set
import scala.collection.mutable

// Creat, initialize and use an mutable set
val movieSet = mutable.Set("Spotlight", "Moonlight")
movieSet += "Parasite"
println(movieSet)

import scala.collection.immutable.HashSet

val hashSet = HashSet("Tomatoes", "Chilies")
val ingredients = hashSet + "Coriander"
println(ingredients)

//-----
// Map
//-----
import scala.collection.mutable

val treasureMap = mutable.Map.empty[Int, String]
treasureMap += (1 -> "Go to island.")
treasureMap += (2 -> "Find big X on ground.")
treasureMap += (3 -> "Dig.")
println(treasureMap)
val step2 = treasureMap(2)

val romanNumeral = Map(
  1 -> "I", 2 -> "II", 3 -> "III", 4 -> "IV", 5 -> "V"
)
val four = romanNumeral(4)
