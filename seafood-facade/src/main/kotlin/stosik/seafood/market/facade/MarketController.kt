package stosik.seafood.market.facade

import org.springframework.data.domain.Pageable
import org.springframework.web.bind.annotation.*
import stosik.seafood.market.facade.domain.MarketFacade
import stosik.seafood.market.facade.domain.ProductDto

@RestController
@RequestMapping("/")
internal class MarketController(private val marketFacade: MarketFacade) {
    @GetMapping("/products")
    fun retrieveAllProductsFromMarket(pageable: Pageable) = marketFacade.findAll(pageable)

    @GetMapping("/product/{name}")
    fun showSpecificProduct(@PathVariable name: String) = marketFacade.show(name)

    @PostMapping("/products/add")
    fun addNewProductToMarket(@RequestBody productDto: ProductDto) = marketFacade.add(productDto)

    @PutMapping("/products/{name}")
    fun updateSpecificProduct(@PathVariable name: String, @RequestBody productDto: ProductDto) = marketFacade
            .updateSpecificProduct(name, productDto)
}
