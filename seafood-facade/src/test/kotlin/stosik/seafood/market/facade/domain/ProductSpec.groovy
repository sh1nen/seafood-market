package stosik.seafood.market.facade.domain

import org.springframework.data.domain.Page
import org.springframework.data.domain.PageRequest
import spock.lang.Specification

class ProductSpec extends Specification implements SampleProducts {
    MarketFacade facade = new MarketConfiguration().marketFacade()

    def "should show a product"() {
        given: "fish is in the system"
        facade.add(pacificHalibut)

        expect: "system return the fish"
        facade.show("Pacific Halibut").name == pacificHalibut.name
    }

    def "should throw an exception when asked for fish that's not in the system"() {
        when: "system is asked for a fish that is not present"
        facade.show("Sea Scallops")

        then: "specific exception should be thrown accordingly"
        thrown(ProductNotFoundException)
    }

    def "should list all films in the system"() {
        given: "there are two fishes in the system"
        facade.add(pacificHalibut)
        facade.add(lobster)

        when: "we ask for all films"
        Page<Product> fishes = facade.findAll(new PageRequest(0, 10))

        then: "system return films we have had added"
        fishes.size() == 2
    }

    def "should update specific product"() {
        given: "there is a halibut in the system"
        facade.add(pacificHalibut)

        when: "we update his name baltic halibut"
        facade.updateSpecificProduct()
    }
}
