package lectures.part1basics

object StringsOps extends App{

  val str: String = "Hello I'm learning Scala"

  println(str.hashCode)
  println(str.substring(2))

  val aNumberString = "2"
  val aNumber = aNumberString.toInt
  println(aNumber)

}
