package stosik.seafood.market.facade.domain

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "products")
internal data class Product(@Id val name: String,
                            val status: String,
                            val desc: String,
                            val imageUrl: String,
                            val price: Int) {

    fun toDto() = ProductDto(
            name = this.name,
            status = this.status,
            desc = this.desc,
            imageUrl = this.imageUrl,
            price = this.price
    )

    companion object {
        fun fromDto(productDto: ProductDto) = Product(
                name = productDto.name,
                status = productDto.status,
                desc = productDto.desc,
                imageUrl = productDto.imageUrl,
                price = productDto.price
        )
    }
}