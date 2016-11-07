package co.mmurp.geo

import scala.language.implicitConversions

class Longitude(lambda: Double) {
  if (lambda > 180.0 || lambda < -180.0)
    throw new IllegalArgumentException
  val asDouble = lambda
}

object Longitude {
  implicit def doubleToLongitude(x: Double) = new Longitude(x)
}
