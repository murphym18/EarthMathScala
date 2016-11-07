package co.mmurp.geo

import scala.language.implicitConversions

class Altitude(h: Double) {
  if (h <= -Altitude.EquatorialRadius)
    throw new IllegalArgumentException
  val asDouble = h
}

object Altitude {
  val EquatorialRadius = 20926667.497 //feet
  implicit def doubleToAltitude(x: Double) = new Altitude(x)
}