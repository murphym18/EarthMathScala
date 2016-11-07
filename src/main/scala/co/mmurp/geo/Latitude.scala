package co.mmurp.geo

import scala.language.implicitConversions

class Latitude(phi: Double) {
  if (phi > 90.0 || phi < -90.0)
    throw new IllegalArgumentException
  val asDouble = phi
}

object Latitude {
  implicit def doubleToLatitude(x: Double) = new Latitude(x)
}


