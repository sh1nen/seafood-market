package stosik.seafood.market.facade.domain

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
internal open class MarketConfiguration
{
    @Bean
    open fun marketFacade() = MarketFacade(
        productCreator = ProductCreator()
    )
}