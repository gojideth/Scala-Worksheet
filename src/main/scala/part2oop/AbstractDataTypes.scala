package part2oop

object AbstractDataTypes extends App {


  //Abstract

  abstract class Animal{
    val creatureType: String = "wild"
    def eat: Unit
  }

  class Dog extends Animal {
    override val creatureType: String = "canine"
    def eat: Unit = println("perreo")
  }

  // traits

  trait Carnivore{
    def eat(animal: Animal): Unit
    val preferredMeal: String = "fresh meat"
  }

  trait ColdBlooded
  class Crocodile extends Animal with Carnivore with ColdBlooded {

    override val creatureType: String = "croc"

    override def eat: Unit = "nom nom croc"

    override def eat(animal: Animal): Unit = println(s"I'm a croc and I'm eating ${animal.creatureType}")
    val x = Seq
  }

  val dog = new Dog
  val crocodile = new Crocodile
  crocodile eat dog

  //traits vs abstract classes
  // 1 - traits do not have constructor parameters
  // 2 - multiple traits may be inherited by the same class
  // 3 - traits = behavior , abstract class = type of "thing"




}
