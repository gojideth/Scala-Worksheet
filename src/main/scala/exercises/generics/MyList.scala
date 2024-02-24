package exercises.generics

abstract class MyList[+A]{ //+A means that this is a covariant list
  def head: A
  def tail: MyList[A]

  def isEmpty: Boolean

  def add[B >: A](element: B): MyList[B]

  def printElements: String

  override def toString: String = "[" + printElements + "]"

}

object Empty extends MyList[Nothing] {
  def head: Nothing = throw new NoSuchElementException("pai no hay elementos")

  def tail: Nothing = throw new NoSuchElementException("pai no hay elementos")

  def isEmpty: Boolean = true

  def add[B >: Nothing](element: B): MyList[B] = new Cons(element, this)

  override def printElements: String = ""
}

class Cons[+A](h: A, t: MyList[A]) extends MyList[A]{

  def head: A = h
  def tail: MyList[A] = t

  def isEmpty: Boolean = false

  def add[B >: A](element:  B): MyList[B] = new Cons[B](element, this)

  override def printElements: String = if (t.isEmpty) {
    "" + h
  } else {
    h + " " + t.printElements
  }
}

object ListTesting extends App{
  val listInt: MyList[Int] = new Cons[Int](1, new Cons[Int](2,  Empty))
  val listStrings: MyList[String] = new Cons[String]("Hello", new Cons[String](" Scala ", Empty))

  println(listInt.toString)
  println(listStrings.toString)

}
