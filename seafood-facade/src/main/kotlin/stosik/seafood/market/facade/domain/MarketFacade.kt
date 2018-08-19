package stosik.seafood.market.facade.domain

import org.springframework.data.domain.Pageable

internal class MarketFacade(private val productRepository: ProductRepository) {
    fun findAll(pageable: Pageable) = productRepository.findAll(pageable)

    fun add(productDto: ProductDto) = productRepository.save(Product.fromDto(productDto))

    fun updateSpecificProduct(name: String, productDto: ProductDto): ProductDto {
        val toUpdateProduct = productRepository.findOneOrThrow(name)
        val updatedProduct = toUpdateProduct.copy(name = productDto.name, status = productDto.status, imageUrl = productDto.imageUrl,
                desc = productDto.desc, price = productDto.price)

        return productRepository.save(updatedProduct)!!.toDto()
    }

    fun show(name: String) = productRepository.findOneOrThrow(name)
}
