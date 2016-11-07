package co.mmurp.geo
import scala.math.abs
import breeze.linalg._
import org.scalatest.FunSuite
class NVectorTestSuite extends FunSuite {
  test("NVector should return an n-vector given latitude and longitude") {
    def checkElements(expected: DenseVector[Double], actual: DenseVector[Double]): Unit = {
      breeze.linalg.zipValues(expected, actual).foreach((x: Double, y: Double)=>{
        assert(abs(x - y) < 0.0001)
      })
    }
    checkElements(DenseVector[Double](1.0, 0, 0), NVector.normalVector(0, 0))
    checkElements(DenseVector[Double](0, 0, 1), NVector.normalVector(90, 0))
    checkElements(DenseVector[Double](0, 1, 0), NVector.normalVector(0, 90))

  }
}
