import org.scalatest.{WordSpec, MustMatchers}

class BarSpec extends WordSpec with MustMatchers {
  "Bar" should {
    "produce 'Hello' when you call hello" in {
      Bar.hello() must equal("Hello")
    }
  }
}
