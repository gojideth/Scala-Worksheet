package part2oop

object AnonymousClasses extends App{

  abstract class Animal{
    def eat: Unit
  }

  //anonymous class
  val funnyAnimal: Animal = new Animal{
    override def eat: Unit = println("ahahahaha")
  }

  println(funnyAnimal.getClass) // class part2oop.AnonymousClasses$$anon$1

  //So what it actually happens:
  /**
   * class AnonymousClasses$$anon$1 extends Animal {
   * override def eat: Unit = println("ahahah")
   * }
   * val funnyAnimal: Animal = new AnonymousClasses$$anon$1
   *
   * This happens because we are modifying its behaviour as we create the variable, not creating a whole new class which wouldn't be anonymous
   */

  class Person(name: String){
    def sayHi: Unit = println(s"Hi my name is $name, how can I help? ")
  }

  val jim = new Person("Jim"){
    override def sayHi: Unit = println(s"Hi, my name is Jim, how can I be of service? ")
  }


}
