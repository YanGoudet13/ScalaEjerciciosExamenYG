package lectures.EjerciciosScalaYG

object Ej7YG extends App {


  val list = List(4, 5, 7, 3, 6, 8, 6, 4, 5)

  def par(x: Int): Boolean = {
    if (x % 2 == 0) true
    else false
  }


  def aplicarFuncion[X, V](funcion: X => V, lista: List[X]): List[V] = {
    lista.map(funcion)
  }
println(aplicarFuncion(par,list))
}