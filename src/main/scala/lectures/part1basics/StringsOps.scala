package lectures.part1basics

object StringsOps extends App{

  val str: String = "Hello I'm learning Scala"

  println(str.hashCode)
  println(str.substring(2))

  val aNumberString = "2"
  val aNumber = aNumberString.toInt
  println(aNumber)

  //Scala specific

  // S-interpolators
  val name = "Tin"
  val age = 12
  val greeting = s"Hello!, My name is $name and my age is $age "
  val greeting1 = s"Hello!, My name is $name and my age is ${age + 23} "
  println(greeting)
  println(greeting1)

  // F-interpolators
  val speed = 1.2f
  val myth = f"$name can eat $speed%2.2f"
  println(myth)

}
