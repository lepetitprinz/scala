// Use List
val oneTwo = List(1, 2)
val threeFour = List(3, 4)
val oneTwoThreeFour = oneTwo ::: threeFour

val twoThree = List(2, 3)
val oneTwoThree = 1 :: twoThree
val oneThreeFive = 1 :: 3 :: 5 :: Nil

// List Methods and usages
val emptyList = List.empty  // empty list
val newList = List("Cool", "tools", "rule")  // creat a new List[String]
val thrill = "Will" :: "fill" :: "until" :: Nil
val concatenatedList = List("a", "b") ::: List("c", "d")  // Concatenates two lists

println(thrill(2))  // Returns the element at index 2
thrill.count(s => s.length == 4)  // Counts the number of string elements in list that have length 4
thrill.drop(2)  // Returns the list without its first 2 elements
thrill.dropRight(2)  // Returns the list without its rightmost 2 elements
thrill.contains("until")  // Determines whether a string element exists in that has the value "until"
thrill.filter(s => s.length == 4)  // Returns a list of all elements of the list that have length 4
thrill.forall(s => s.endsWith("l"))  // Indicates whether all elements in the list end with the letter "l"
thrill.foreach(s => print(s))  // Executes the print statement on each of the strings in the list
thrill.foreach(print)  // Same as the previous, but more concise
thrill.head  // Returns the first element in the list
thrill.last  // Returns the last element in the list
thrill.init  // Returns a list of all but the last element in the list
thrill.tail  // Returns the list minus its first element
thrill.isEmpty  // Indicates whether the list is empty
thrill.length  // Returns the number of elements in the thrill list
thrill.map(s => s + "y")  // Returns a list resulting from adding a "y" to each string element in the list
thrill.mkString(", ")  // Makes a string with the elements of the list
thrill.filterNot(s => s.length == 4)  // Returns a list of all elements of the list except those that have length 4
thrill.reverse  // Returns a list containing all elements of the list in reverse order
// Returns a list containing all elements of the list in alphabetical order of the first lowercase character
thrill.sortWith((s, t) => s.charAt(0).toLower < t.charAt(0).toLower)

