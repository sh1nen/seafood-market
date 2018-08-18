package stosik.seafood.market.facade.domain

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
internal open class MarketConfiguration
{
    fun marketFacade() = marketFacade(InMemoryProductRepository())

    @Bean
    open fun marketFacade(productRepository: ProductRepository) = MarketFacade(
        productCreator = ProductCreator(),
        productRepository = productRepository
    )
}