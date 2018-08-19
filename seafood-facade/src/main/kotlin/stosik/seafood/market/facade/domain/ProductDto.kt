package stosik.seafood.market.facade.domain

internal data class ProductDto(val name: String,
                               val status: String,
                               val desc: String,
                               val imageUrl: String,
                               val price: Int)
