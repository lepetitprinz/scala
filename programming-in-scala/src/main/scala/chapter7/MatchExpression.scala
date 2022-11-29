package chapter7

class MatchExpression {
  val args = Array("salt", "chips", "eggs")
  
  // Match expressions
  val firstArg = if !args.isEmpty then args(0) else ""
  firstArg match
    case "salt" => println("pepper")
    case "chips" => println("salsa")
    case "eggs" => println("bacon")
    case _ => println("huh?")

  // match expression that yields a value
  val firstArg2 = if !args.isEmpty then args(0) else ""
  val friend =
    firstArg2 match
      case "salt" => "pepper"
      case "chips" => "salsa"
      case "eggs" => "bacon"
      case _ => "huh?"
  println(friend)
}
