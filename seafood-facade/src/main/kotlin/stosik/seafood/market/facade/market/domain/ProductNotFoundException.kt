package stosik.seafood.market.facade.market.domain

internal class ProductNotFoundException(override val message: String): RuntimeException(message)