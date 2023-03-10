package lectures.EjerciciosScalaYG

object Ej3YG{

  import scala.io.StdIn.readLine
  import scala.util.Random
  val r = new scala.util.Random

  val minusculas: String = "abcdefghijklmnopqrstuvwxyz"
  val mayusculas: String = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
  val numeros: String = "01023456789"

  val pedirLongitud: String = "Introduzca la longitud de las contraseñas (Enteros positivos):"
  val pedirTamaño: String =  "Introduzca el número de contraseñas que quiere generar (Enteros positivos):"
  val mensajeError: String = "Solo se admiten valores enteros positivos"

  class Password(val longitud: Int = 8, var contraseña: String = "") {

    var n: Int = longitud

    def generarPassword(n: Int = longitud): String = {


      def randomChar: String =

        val MMU: Int = r.between(1, 4)
        val randomMay: Int = r.between(0, mayusculas.length)
        val randomMin: Int = r.between(0, minusculas.length)
        val randomNum: Int = r.between(0, numeros.length)

        if (MMU == 1) mayusculas.charAt(randomMay).toString
        else if (MMU == 2) minusculas.charAt(randomMin).toString
        else if (MMU == 3) numeros.charAt(randomNum).toString
        else ""


      if (n == 0) ""
      else randomChar + generarPassword(n - 1)
    }



    def esFuerte(contrasena: String = this.contraseña): Boolean = {
      val numMayusculas = contrasena.count(mayusculas.contains(_))
      val numMinusculas = contrasena.count(minusculas.contains(_))
      val numNumeros = contrasena.count(numeros.contains(_))
      if (numMayusculas > 2 && numMinusculas > 1 && numNumeros > 5) true
      else false
    }
    def getPassword(): String = contraseña
    contraseña = generarPassword(longitud)
  }

}
