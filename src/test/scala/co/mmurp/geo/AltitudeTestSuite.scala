package co.mmurp.geo

import org.scalatest.FunSuite

class AltitudeTestSuite extends FunSuite {
  test("Altitude constructor fails given bad input") {
    def testBadInput(n: Double): Unit = assertThrows[IllegalArgumentException]{
      new Altitude(n)
    }

    testBadInput(-Altitude.EquatorialRadius)
    testBadInput(-(Altitude.EquatorialRadius + 1))
    testBadInput(-(Altitude.EquatorialRadius * 2))
    testBadInput(-Double.MaxValue)
  }

  test("Altitude objects hold a value") {
    def testValue(n: Double): Unit = {
      assert(new Altitude(n).asDouble == n)
    }

    testValue(1 - Altitude.EquatorialRadius)
    testValue(0)
    testValue(Double.MinPositiveValue)
    testValue(10)
    testValue(100)
    testValue(1000)
    testValue(9999)
    testValue(99999)
    testValue(999999)
    testValue(999999e9)
    testValue(Altitude.EquatorialRadius)
    testValue(Altitude.EquatorialRadius * 2)
    testValue(Double.MaxValue)
  }
}
