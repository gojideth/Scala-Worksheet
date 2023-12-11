package part2oop

object MethodNotations extends App{

  class Person(val name: String, favoriteMovie: String){
    def likes(movie: String): Boolean = movie  == favoriteMovie

    def hangoutWith(person: Person): String = {
      s"${this.name} is hanging out with ${person.name}"
    }

  }

  val mary = new Person("Mary", "Inception")
  println(mary.likes("Inception"))
  println(mary likes("Inception"))

  //infix notation = operator notation
  val tom = new Person("Tom", "Fight Club")
  //"Operators" in Scala
  println(mary hangoutWith tom) //infix notation = operator notation (syntatic sugar)

  println(1+2)
  println(1.*(2))
  //All operators are methods

  //Prefix notation
  val x = -1 //equivalent with 1.unary_ -
  val Y = 1.unary_-
  //unary underscore prefix only works with - + ¿

}
