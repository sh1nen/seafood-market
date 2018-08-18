package stosik.seafood.market.facade.domain

import org.springframework.data.domain.Page
import org.springframework.data.domain.PageImpl
import org.springframework.data.domain.Pageable
import java.util.concurrent.ConcurrentHashMap

internal class InMemoryProductRepository : ProductRepository
{
    private val productStore: ConcurrentHashMap<String, Product> = ConcurrentHashMap()

    override fun save(product: Product): Product? = productStore.put(product.name, product)

    override fun findById(title: String): Product? = productStore[title]

    override fun findAll(pageable: Pageable): Page<Product> = PageImpl<Product>(ArrayList<Product>(productStore.values), pageable, productStore.size.toLong())
}
