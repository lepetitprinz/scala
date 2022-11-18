case class Person(name: String, age: Int)

// create a companion object
val p = Person("Sally", 39)

// can a acces the value given for a Person'name and age
p.name
p.age

// the compiler will provide an implementation of toString
p.toString

// the compiler will generate an implementation of hashCode and equals for class
p == Person("Sally", 21)
p.hashCode == Person("Sally", 21).hashCode
p == Person("Sally", 39)
p.hashCode == Person("Sally", 39).hashCode

