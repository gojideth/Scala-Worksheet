package part2oop

object Generics extends App{

  class MyList[+A]{
    def add[B >: A](element: B): MyList[B] = ???
    /*
      A = Cat
      B = Dog (Animal)

     */

  }

  val newList = new MyList[String]

  object MyList{
    def empty[A]: MyList[A] = {
      ???
    }
  }
  val emptyListInt = MyList.empty[Int]

  //variance problem

  class Animal
  class Cat extends Animal
  class Dog extends Animal

  // Question: if cat extends animal, does a list of cat extends also animal?

  //1. yes List[Cat] extends List[Animal] = COVARIANCE
  class CovariantList[+A]
  val animal: Animal = new Cat
  val animalList: CovariantList[Animal] = new CovariantList[Cat]

  // animalList.add(new Dog) ??? HARD QUESTION => We return a list of Animals.
  //if we add a dog to the cat list which is a animal list, then it'll be an animal list
  
  //2. NO, list[Animal] != list[Cat]
  class InvariantList[A]
  // val invariantAnimalList: InvariantList[Animal] = new InvariantList[Cat] //If I specify Animal then I need to put ANIMAL, not anything else
  val invariantList: InvariantList[Animal] = new InvariantList[Animal]

  //3. Hell, no! CONTRAVARIANCE
  class ContravariantList[-A]
  val contravariantList: ContravariantList[Cat] = new ContravariantList[Animal] //Happens the same as Covariant but reversed

  class Trainer[-A]
  val trainer: Trainer[Cat] = new Trainer[Animal]

  //Bounded Types

  class Cage[A <: Animal](animal: A) //This only accepts parameters of type A that are type Animal
  val cage = new Cage[Dog](new Dog)

  class Car
  //val newCage = new Cage(new Car) This won't be accepted

  //Lower bounded type
  class Cageb[A <: Animal] (animal: A)
  val cageLowerBoundedType = new Cageb[Cat](new Cat)




}
