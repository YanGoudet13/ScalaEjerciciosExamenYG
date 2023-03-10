package EjerciciosScalaYG

object EJ10YG extends App {

  val listaInmobiliarios = List(
    Map("año" -> 2000, "metros" -> 100, "habitaciones" -> 3, "garaje" -> true, "zona" -> "A"),
    Map("año" -> 2012, "metros" -> 60, "habitaciones" -> 2, "garaje" -> true, "zona" -> "B"),
    Map("año" -> 1980, "metros" -> 120, "habitaciones" -> 4, "garaje" -> false, "zona" -> "A"),
    Map("año" -> 2005, "metros" -> 75, "habitaciones" -> 3, "garaje" -> true, "zona" -> "B"),
    Map("año" -> 2015, "metros" -> 90, "habitaciones" -> 2, "garaje" -> false, "zona" -> "A")
  )

  def filterByPrice(listaInmobiliarios: List[Map[String, Any]], precioMax: Double): List[Map[String, Any]] = {

    val PRECIO_METRO = 1000
    val COSTO_HABITACIONES = 5000
    val COSTO_GARAJE = 15000
    val Fecha = 2023

    def precioZ(inmueble: Map[String, Any]): Double = {
      val costoMetrosTotalA = inmueble("metros").asInstanceOf[Int] * PRECIO_METRO
      val costoHabitacionesTotalA = inmueble("habitaciones").asInstanceOf[Int] * COSTO_HABITACIONES
      val costoGarajeTotalA = if (inmueble("garaje").asInstanceOf[Boolean]) COSTO_GARAJE else 0
      val factorPorantiguedad: Double = inmueble("zona").asInstanceOf[String] match {
        case "A" => (1 - ((Fecha - inmueble("año").asInstanceOf[Int]).toDouble / 100)).toDouble
        case "B" => (1 - (Fecha - inmueble("año").asInstanceOf[Int]).toDouble / 100) * 1.5
      }
      (costoMetrosTotalA + costoHabitacionesTotalA + costoGarajeTotalA) * factorPorantiguedad
    }

    val precios = listaInmobiliarios.map(precioZ)
    val inmobiliariosConPrecio = listaInmobiliarios.zip(precios).map { case (inmueble, precio) =>
      inmueble + ("precio" -> precio)
    }

    val inmobiliariosFiltrados = inmobiliariosConPrecio.filter(inmueble => inmueble("precio").asInstanceOf[Double] < precioMax)
    inmobiliariosFiltrados
  }

  val precioMax = 150000
  println(filterByPrice(listaInmobiliarios,precioMax))
}
