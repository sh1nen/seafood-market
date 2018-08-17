package stosik.seafood.market

import io.restassured.module.mockmvc.RestAssuredMockMvc
import spock.lang.Specification
import stosik.seafood.market.facade.market.MarketController

abstract class BaseMockMvcSpec extends Specification
{
    def setup()
    {
        RestAssuredMockMvc.standaloneSetup(new MarketController())
    }
}
