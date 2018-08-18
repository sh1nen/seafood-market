package stosik.seafood.market.base

import io.restassured.module.mockmvc.RestAssuredMockMvc
import spock.lang.Specification
import stosik.seafood.market.facade.MarketController

abstract class BaseMockMvcSpec extends Specification
{
    def setup()
    {
        RestAssuredMockMvc.standaloneSetup(new MarketController())
    }
}
