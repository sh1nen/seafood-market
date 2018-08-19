package stosik.seafood.market.facade.domain

import groovy.transform.CompileStatic

@CompileStatic
trait SampleProducts {

    ProductDto pacificHalibut = createProductDto("Pacific Halibut", "available", "/images/halibut.jpg",
            "Everyones favorite white fish. We will cut it to the size you need and ship it.", 1724)

    ProductDto lobster = createProductDto("Lobster", "available", "/images/lobster.jpg",
            "These tender, mouth-watering beauties are a fantastic hit at any dinner party.", 3200)

    static private createProductDto(String name, String status, String imageUrl, String desc, int price) {
        return new ProductDto(name, status, desc, imageUrl, price)
    }
}
