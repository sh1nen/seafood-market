package stosik.seafood.market.facade

import org.springframework.data.domain.Pageable
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import stosik.seafood.market.facade.domain.MarketFacade
import stosik.seafood.market.facade.domain.ProductDto

@RestController
internal class MarketController(private val marketFacade: MarketFacade)
{
    @GetMapping("/products")
    fun retrieveAllProductsFromMarket(pageable: Pageable) = marketFacade.findAll(pageable)

    @PostMapping("/products/add")
    fun addNewProductToMarket(@RequestBody productDto: ProductDto) = marketFacade.add(productDto)
}