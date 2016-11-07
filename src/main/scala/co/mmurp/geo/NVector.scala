package co.mmurp.geo

import breeze.linalg._
import scala.math.{cos, sin, asin, atan2}

private object Helpers {


}
object NVector {
  def normalVector(lat: Latitude, long: Longitude): DenseVector[Double] = {
    val phi = lat.asDouble
    val lambda = long.asDouble
    val cosLat = cos(phi)
    val x = cosLat * cos(lambda)
    val y = cosLat * sin(lambda)
    val z = sin(phi)
    DenseVector(x, y, z)
  }
}
