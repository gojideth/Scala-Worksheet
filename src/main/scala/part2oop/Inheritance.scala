package part2oop

object Inheritance extends App{

  //Single class inheritance, just one class at a time
  class Animal{

    val creatureType = "Wild"
    def eat = println("nomnom")

    protected def fly = println("fly")
  }

  class Cat extends Animal {
    def crunch =
      fly
  }

  val cat = new Cat

  cat.eat

  //Constructors


  class Person( name: String, age: Int){
    def this(name: String) = this(name, 0)
  }
  class Adult(name: String, age: Int, idCard: String) extends Person(name)

  class Dog(override val creatureType: String) extends Animal{
    override def eat: Unit = {
      super.eat
      println("cruncheoo")
    }

    //override val creatureType: String = "domestic"
  }

  val dog = new Dog("k9")
  dog.eat
  println(dog.creatureType)

  //type substitution (BROAD: polymorphism)

  val unknowAnimal: Animal = new Dog("K9")

  unknowAnimal.eat

  //overriding vs overloading


  //super

  //preventing overrides
  //1. Use final on member
  //2. Use final on the entire class
  //3. Seal the class = extends class in THIS FILE ONLY, prevent extension in other file.








}
