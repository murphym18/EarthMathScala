package co.mmurp.geo

import org.scalatest.FunSuite
class NVectorTestSuite extends FunSuite {
  test("NVector should return an n-vector given latitude and longitude") {
    NVector.normalVector(32, -70)
  }
}
