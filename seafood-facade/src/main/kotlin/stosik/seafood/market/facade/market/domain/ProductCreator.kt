package stosik.seafood.market.facade.market.domain

internal class ProductCreator
{
    fun from(productDto: ProductDto) = Product(
        name = productDto.name,
        category = productDto.category,
        price = productDto.price)
}