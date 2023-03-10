package lectures.EjerciciosScalaYG


object Ej5YG extends App {
  import scala.io.StdIn.readLine
  import scala.math._

  def calculadoraScien(): Unit = {
    println("¿Qué función desea calcular?")
    println("1. Seno")
    println("2. Coseno")
    println("3. Tangente")
    println("4. Exponencial")
    println("5. Logaritmo neperiano")

    val f = scala.io.StdIn.readInt()

    println("Introduzca el valor:")
    val valor = scala.io.StdIn.readInt()

    def calculateFunc(n: Int): Double = f match {
      case 1 => sin(n)
      case 2 => cos(n)
      case 3 => tan(n)
      case 4 => exp(n)
      case 5 => log(n)

    }

    def printTable(n: Int): Unit = {
      if (n > 0) {
        printTable(n - 1)
        val result = calculateFunc(n)
        println(s"$n\t$result")
      }
    }

    printTable(valor)
  }
  calculadoraScien()
}
