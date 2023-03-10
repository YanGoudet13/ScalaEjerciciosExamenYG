package ExamenScalaYG

object P1YG extends App {

  class MuggleException(mensajeError: String = "Eres un sucio Muggle") extends Exception(mensajeError) {
  }

  object SombreroSeleccionador {
    private val caracteristicasGrifindor: List[String] = List("CORAJE", "OSADIA", "TEMPLE", "CABALLEROSIDAD", "BASICO")
    private val caracteristicasHufflepuff: List[String] = List("AMIGABLE", "LEAL", "TRABAJADOR")
    private val caracteristicasRavenclaw: List[String] = List("SABIDURIA", "INGENIO", "INTELECTO")
    private val caracteristicasSlytherin: List[String] = List("AMBICIOSO", "INTELIGENTE", "ASTUTO", "LIDER")

    def apply(caracteristica: String): Unit = {
      caracteristica.toUpperCase() match {
        case c if caracteristicasGrifindor.contains(c) => println("GRYFFINDOR")
        case c if caracteristicasHufflepuff.contains(c) => println("HUFFLEPUFF")
        case c if caracteristicasRavenclaw.contains(c) => println("RAVENCLAW")
        case c if caracteristicasSlytherin.contains(c) => println("SLYTHERIN")
        case _ => throw new MuggleException()
      }
    }
  }

  SombreroSeleccionador("Trabajador")
  SombreroSeleccionador("BasicO y idk")
}
