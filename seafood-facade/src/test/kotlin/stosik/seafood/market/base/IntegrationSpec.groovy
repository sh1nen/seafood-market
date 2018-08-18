package stosik.seafood.market.base

import org.junit.runner.RunWith
import org.springframework.boot.test.autoconfigure.json.AutoConfigureJsonTesters
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment
import org.springframework.cloud.contract.stubrunner.spring.AutoConfigureStubRunner
import org.springframework.cloud.contract.wiremock.AutoConfigureWireMock
import org.springframework.test.context.junit4.SpringRunner
import spock.lang.Specification

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.MOCK)
@AutoConfigureWireMock
@AutoConfigureJsonTesters
@AutoConfigureStubRunner(ids = "stosik.seafood:seafood-facade:+:stubs:8090")
abstract class IntegrationSpec extends Specification
{

}
