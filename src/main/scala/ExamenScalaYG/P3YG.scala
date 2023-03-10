package ExamenScalaYG

object P3YG extends App{


    object EncryptVowel {
      def ejemplo(vowelsList: List[Char]): List[Char] = {
        val cipherMap = Map('a' -> 'L', 'e' -> '9', 'i' -> '$', 'o' -> 'R', 'u' -> '4')
        vowelsList.map((x: Char) => cipherMap.getOrElse(x, x))
      }


      def apply(listaBusqueda: List[String]): List[String] = {
        val lista1 = List("a", "e", "i", "o", "u")
        val lista2 = List("L", "$", "9", "R", "4")
        val mapaCifrado = lista1.zip(lista2).toMap

        val valoresCifrados = listaBusqueda.flatMap(letra => mapaCifrado.get(letra.toLowerCase))

        valoresCifrados
      }
  }

  println(EncryptVowel(List("a", "i", "e", "a")))
  println(EncryptVowel(List("a")))
  println(EncryptVowel(List("i","e")))





}
