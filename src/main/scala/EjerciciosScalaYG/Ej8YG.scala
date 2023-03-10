package lectures.EjerciciosScalaYG

object Ej8YG extends App {

  //Escribir una función que reciba una frase y devuelva un diccionario con las palabras que contiene y su  longitud.

  val frase: String = "Hola, esta es una frase de prueba"

  def palabrasLongitud(frase: String): Map[String, Int] = {
    // Eliminar signos de puntuación y convertir a minúsculas
    val fraseLimpia = frase.toLowerCase().replaceAll("[,.:;!?]", "")
    // Separar las palabras y guardar en una lista
    val palabras = fraseLimpia.split(" ")
    // Crear el mapa vacío
    var mapaPalabras = Map[String, Int]()
    // Recorrer la lista de palabras y agregar al mapa
    for (palabra <- palabras) {
      mapaPalabras += (palabra -> palabra.length)
    }
    mapaPalabras
  }

  println(palabrasLongitud(frase))
}
