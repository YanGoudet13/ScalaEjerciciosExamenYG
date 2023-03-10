package lectures.EjerciciosScalaYG

object Ej9YG extends App{

  //Escribir una función reciba un diccionario con las asignaturas y las notas de un alumno y devuelva otro
  //diccionario con las asignaturas en mayúsculas y las calificaciones correspondientes a las notas aprobadas.


  val boleta1: Map[String, Double] = Map(("Mate", 4), ("Inglés", 10), ("Arte", 9))


  def aprobadas(alumno: Map[String, Double]) = {
    alumno.filter(kv => kv._2 >= 7).map { (asig, nota) => asig.toUpperCase -> nota }
  }


  println(aprobadas(boleta1))


}

