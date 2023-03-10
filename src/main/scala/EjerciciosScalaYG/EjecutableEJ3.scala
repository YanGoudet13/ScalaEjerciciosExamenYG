package EjerciciosScalaYG


import lectures.EjerciciosScalaYG.Ej3YG.{Password, mensajeError, pedirLongitud, pedirTamaño}

import scala.io.StdIn.readLine

object EjecutableEJ3 extends App {



  val longitud = {
    val value = readLine(pedirLongitud).toInt
    if (value > 0) value
    else throw new IllegalArgumentException(mensajeError)
  }
  val longitudLista = {
    val value = readLine(pedirTamaño).toInt
    if (value > 0) value
    else throw new IllegalArgumentException(mensajeError)
  }
  val passwords = new Array[Password](longitudLista)
  val esFuerte = new Array[Boolean](longitudLista)

  for (i <- 0 until longitudLista) {
    passwords(i) = new Password(longitud)
    esFuerte(i) = passwords(i).esFuerte()
  }

  for (i <- 0 until longitudLista) {
    println(s"${passwords(i).getPassword()} ${esFuerte(i)}")
  }
  
}
