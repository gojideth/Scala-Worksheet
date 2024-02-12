package part2oop

object Object extends App{

  object Person{ //type + its only instance
    // "static/class" - level functionality
    val N_EYES = 2

    def canFly:Boolean = false

    def apply(mother:Person, father:Person): Person = new Person("Pepe")
  }

  class Person(val name:String){
     // instance-level functionality
  }
  //COMPANIONS

  println(Person.N_EYES)
  println(Person.canFly)

  val maria = new Person("Maria")
  val juan = new Person("Juan")

  val pepe = Person(maria, juan)

  //Scala object is SINGLETON INSTANCE
  val person1 = Person
  val person2 = Person
  println(person1==person2) //Singleton instance, they are sharing the same pointer


  // Scala Application = Scala object with
  // def main(args: Array(String)): Unit




}
