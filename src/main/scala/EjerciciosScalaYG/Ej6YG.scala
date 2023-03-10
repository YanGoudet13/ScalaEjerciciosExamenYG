package lectures.EjerciciosScalaYG

object Ej6YG extends App {

  /*Escribir una función que reciba otra función y una lista, y devuelva otra lista con el resultado de aplicar la
  función dada a cada uno de los elementos de la lista.
  */

  val list= List(4,5,7,3,6,8,6,4,5)

  def duplicar(x: Int): Int =  x*2

  def aplicarFuncion[X, V](funcion: X => V, lista: List[X]): List[V] = {
    lista.map(funcion)

  }
  println(aplicarFuncion(duplicar,list))
}
