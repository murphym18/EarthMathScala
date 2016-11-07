package co.mmurp.geo

import org.scalatest.FunSuite

class LatitudeTestSuite extends FunSuite {
  test("Latitude constructor fails given bad input") {
    def testBadInput(n: Double): Unit = assertThrows[IllegalArgumentException] {
      new Latitude(n)
    }

    testBadInput(-Double.MaxValue)
    testBadInput(-999999.9)
    testBadInput(-90.0001)
    testBadInput(-91)
    testBadInput(90.0001)
    testBadInput(91)
    testBadInput(999999.9)
    testBadInput(Double.MaxValue)
  }

  test("Latitude objects hold a value") {
    def testValue(n: Double): Unit = {
      assert(new Latitude(n).asDouble == n)
    }

    testValue(-90)
    testValue(-89.999)
    testValue(-32.242)
    testValue(-1)
    testValue(-0.0)
    testValue(0)
    testValue(Double.MinPositiveValue)
    testValue(1)
    testValue(32.242)
    testValue(89.999)
    testValue(90)
  }
}
