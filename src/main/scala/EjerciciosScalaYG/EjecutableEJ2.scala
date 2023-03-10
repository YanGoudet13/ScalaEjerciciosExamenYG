package lectures.EjerciciosScalaYG

import scala.io.StdIn.{readLine, readInt, readDouble}

object EjecutableEJ2 extends App {

  val persona1 = Persona()


  val persona2 = Persona()
  persona2.nombre = "Mary"
  persona2.edad = 65
  persona2.sexo = 'F'

  val persona3 = Persona()

  println("Ingrese los datos para persona1:")
  print("Nombre: ")
  persona1.nombre  = readLine()
  print("Edad: ")
  persona1.edad = readInt()
  print("Sexo (M o F): ")
  persona1.sexo = readLine().head
  print("Peso (kg): ")
  persona1.peso = readDouble()
  print("Altura (m): ")
  persona1.altura = readDouble()

  
  println(persona1.calcularIMC())
  println(persona2.calcularIMC())
  println(persona3.calcularIMC())

  println(persona1.esMayorDeEdad())
  println(persona2.esMayorDeEdad())
  println(persona3.esMayorDeEdad())

  println(persona1.toString)
  println(persona2.toString)
  println(persona3.toString)






}
