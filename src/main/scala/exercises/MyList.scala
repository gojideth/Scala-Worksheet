package exercises

abstract class MyList {

  def head: Int
  def tail: MyList

  def isEmpty: Boolean

  def add(element: Int): MyList

  def printElements: String

  override def toString: String = "[" + printElements + "]"

}

object Empty extends MyList {
  def head: Int = throw new NoSuchElementException("pai no hay elementos")

  def tail: MyList = throw new NoSuchElementException("pai no hay elementos")

  def isEmpty: Boolean = true

  def add(element: Int): MyList = new Cons(element, Empty)

  override def printElements: String = ""
}

class Cons(h: Int, t: MyList) extends MyList{

  def head: Int = h

  def tail: MyList = t

  def isEmpty: Boolean = false

  def add(element: Int): MyList = new Cons(element, this)

  override def printElements: String = if(tail.isEmpty){
    this.h + ""
  }else {
    h + " " + t.printElements
  }
}

object ListTest extends App{
  private val myList = new Cons(1, Empty)
  private val myList2 = new Cons(1, new Cons(2, new Cons(3,Empty)))
  println(myList.head)
  println(myList2.tail.head)
  println(myList.add(4).head)
  println(myList2.toString)

}


