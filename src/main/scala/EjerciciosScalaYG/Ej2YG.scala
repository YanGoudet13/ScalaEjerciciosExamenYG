package lectures.EjerciciosScalaYG

import scala.util.Random

object Ej2YG extends App {


}

class Persona private(var _nombre: String = "", var _edad: Int = 0, var _sexo: Char = Persona.HOMBRE, var _peso: Double = 0.0, var _altura: Double = 0.0) {

  private var _dni: String = generaDNI()

  def nombre = _nombre
  def edad = _edad
  def dni = _dni
  def sexo = _sexo
  def peso = _peso
  def altura = _altura

  def nombre_=(nuevoNombre: String): Unit = _nombre = nuevoNombre
  def edad_=(nuevaEdad: Int): Unit = _edad = nuevaEdad
  def sexo_=(nuevoSexo: Char): Unit = _sexo = nuevoSexo
  def peso_=(nuevoPeso: Double): Unit = _peso = nuevoPeso
  def altura_=(nuevaAltura: Double): Unit = _altura = nuevaAltura

  def calcularIMC(): String = {
    val imc = _peso / Math.pow(_altura, 2)
    if (imc < 20) "-1 - Debajo del peso ideal"
    else if (imc >= 20 && imc <= 25) "0 - En peso ideal"
    else "1 - Arriba del peso ideal"
  }

  def esMayorDeEdad(): String =
    if (_edad >= Persona.MAYORIA_DE_EDAD)  "Es mayor de edad"
    else "Es menor de edad"

  private def comprobarSexo(sexo: Char): Char = {
    if (sexo == Persona.HOMBRE || sexo == Persona.MUJER) sexo
    else Persona.HOMBRE
  }

  override def toString: String = s"Nombre: ${_nombre}, Edad: ${_edad}, DNI: ${_dni}, Sexo: ${_sexo}, Peso: ${_peso}, Altura: ${_altura}"

  private def generaDNI(): String = {
    val dniSinLetra = Random.nextInt(100000000).toString
    val letraDni = Persona.LETRAS_DNI(dniSinLetra.toInt % 23)
    s"$dniSinLetra$letraDni"
  }
}

object Persona {
  private val HOMBRE = 'H'
  private val MUJER = 'M'
  private val MAYORIA_DE_EDAD = 18
  private val LETRAS_DNI = "TRWAGMYFPDXBNJZSQVHLCKE"


  def apply(): Persona = new Persona()

  def apply(nombre: String, edad: Int, sexo: Char = HOMBRE): Persona = new Persona(nombre, edad, sexo)

  def apply(nombre: String, edad: Int, dni: String, sexo: Char, peso: Double, altura: Double): Persona = {
    val persona = new Persona(nombre, edad, sexo, peso, altura)
    persona._dni = dni
    persona
  }

}
