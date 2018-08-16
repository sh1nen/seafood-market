package stosik.seafood.market.facade.market.domain

import mu.KotlinLogging
import org.springframework.data.domain.Pageable

private val log = KotlinLogging.logger { }

internal class MarketFacade(private val productRepository: ProductRepository, private val productCreator: ProductCreator)
{
    fun findAll(pageable: Pageable) = productRepository.findAll(pageable)

    fun add(productDto: ProductDto) = productRepository.save(productCreator.from(productDto))
}
