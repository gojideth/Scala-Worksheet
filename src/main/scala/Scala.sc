
val list = 10 :: 20 :: 3 :: Nil

list.head
list.tail


def searchFor[T](l: List[T], fx: (T, T) => Boolean ): Option[T] = l match {
  case Nil => None
  case head :: Nil => Some(head)
  case head :: _ => searchFor(l.tail, fx).map(value => if(fx(head , value)) head else value)
}

def max[T](l: List[T])(implicit  order: Ordering[T]): Option[T] = searchFor(l, order.gt )
def min[T](l: List[T])(implicit  order: Ordering[T]): Option[T] = searchFor(l, order.lt )


max(list)
min(list)

val names = "Pepe" :: "Titina" :: "Juan" :: Nil

max(names)

