package co.mmurp.geo

import org.scalatest.FunSuite

class LongitudeTestSuite extends FunSuite {
  test("Longitude constructor fails given bad input") {
    def testBadInput(n: Double): Unit = assertThrows[IllegalArgumentException]{
      new Longitude(n)
    }

    testBadInput(-Double.MaxValue)
    testBadInput(-9999)
    testBadInput(-181)
    testBadInput(-180.1)
    testBadInput(180.1)
    testBadInput(181)
    testBadInput(9999)
    testBadInput(Double.MaxValue)
  }

  test("Longitude objects hold a value") {
    def testValue(n: Double): Unit = {
      assert(new Longitude(n).asDouble == n)
    }

    testValue(-180)
    testValue(-179.9999)
    testValue(-90)
    testValue(-49)
    testValue(-0.0)
    testValue(0.0)
    testValue(Double.MinPositiveValue)
    testValue(49)
    testValue(90)
    testValue(179.9999)
    testValue(180)
  }
}
