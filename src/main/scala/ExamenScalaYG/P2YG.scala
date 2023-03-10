package ExamenScalaYG

object P2YG extends App {


  object hofEnteros {
    def apply(function: (Int, Int) => Int, numeros: Int*): Int = {
      numeros.reduce(function)
    }
    def suma(numero1: Int, numero2: Int): Int = numero1 + numero2

    def resta(numero1: Int, numero2: Int): Int = numero1 - numero2

    def multiplicacion(numero1: Int, numero2: Int): Int = numero1 * numero2
  }

  println(hofEnteros((x, y) => x + y, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10))
  println(hofEnteros(hofEnteros.suma, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10))
  println(hofEnteros(hofEnteros.resta, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10))
  println(hofEnteros(hofEnteros.multiplicacion, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10))

}