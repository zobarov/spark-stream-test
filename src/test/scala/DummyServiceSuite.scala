import com.epam.awg.DummyService
import org.scalatest.funsuite.AnyFunSuite
import org.junit.runner.RunWith
import org.scalatestplus.junit.JUnitRunner


class DummyServiceSuite extends AnyFunSuite {
  test("someJobToBeDone is always true") {
    def service = new DummyService()
    assert(service.someJobToBeDone())
  }
}
