package lectures.EjerciciosScalaYG

object Ejercico1_ScalaYG extends App {


  val cuentaY = new Cuenta("Yan", 800)

  println(cuentaY.ingresar(200).toString)
  println(cuentaY.retirar(200).toString)
  println(cuentaY.retirar(2000).toString)


}

class Cuenta(val titular: String, var cantidad: Double = 0) {

  def ingresar(cantidad: Double = cantidad) = {
    if (cantidad > 0) this.cantidad + cantidad
    else this.cantidad
  }

  def retirar(cantidad: Double = cantidad) = {
    if (cantidad < this.cantidad) this.cantidad - cantidad
    else 0
  }

  override def toString: String = (s"El titular de la cuenta es: $titular. Tiene una cantidad de: $cantidad")
}