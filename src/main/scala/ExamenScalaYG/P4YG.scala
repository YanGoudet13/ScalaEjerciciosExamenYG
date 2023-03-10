package ExamenScalaYG

object P4YG extends App {

  import scala.annotation.tailrec

  class PascalRowException(message: String = "Hay un error de pascal :c") extends Exception(message) {
  }
  object TrianguloPascal {

    def apply(row: Int): List[Int] = {
      if (row <= 0) throw new PascalRowException("No hay filas negativas")
      val resultado = for (col <- 0 until row) yield {
        pascal(row - 1, col)
      }
      resultado.toList
    }

    private def pascal(row: Int, column: Int): Int =
      if (column == 0 || row == column) 1
      else pascal(row - 1, column - 1) + pascal(row - 1, column)
  }


  println(TrianguloPascal(7))
  println(TrianguloPascal(-1))
}



