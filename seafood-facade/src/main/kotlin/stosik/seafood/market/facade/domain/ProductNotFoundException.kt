package stosik.seafood.market.facade.domain

internal class ProductNotFoundException(override val message: String) : RuntimeException(message)