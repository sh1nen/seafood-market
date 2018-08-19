package stosik.seafood.market.facade.domain

import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.repository.Repository

internal interface ProductRepository : Repository<Product, Long>
{
    fun save(product: Product): Product?

    fun findById(title: String): Product?

    fun findAll(pageable: Pageable): Page<Product>

    fun findOneOrThrow(title: String): Product
    {
        return findById(title) ?: throw ProductNotFoundException(title)
    }
}
