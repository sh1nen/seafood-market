package stosik.seafood.market.facade.market.domain

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.math.BigDecimal

@Document
internal data class Product(@Id val name: String,
                            val category: String,
                            val price: BigDecimal)