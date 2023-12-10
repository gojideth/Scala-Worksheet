
val list = 10 :: 20 :: 3 :: Nil

list.head
list.tail


def buscar[T](l: List[T], fx: (T, T) => Boolean ): Option[T] = l match {
  case Nil => None
  case head :: Nil => Some(head)
  case head :: _ => buscar(l.tail, fx).map(value => if(fx(head , value)) head else value)
}

def maximo[T](l: List[T])(implicit  order: Ordering[T]): Option[T] = buscar(l, order.gt(_,_) )
def minimo[T](l: List[T])(implicit  order: Ordering[T]): Option[T] = buscar(l, order.lt(_,_) )


maximo(list)
minimo(list)

val names = "Pepe" :: "Titina" :: "Juan" :: Nil

maximo(names)

