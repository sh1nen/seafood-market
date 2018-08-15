package stosik.seafood.market.facade

import org.springframework.boot.Banner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.builder.SpringApplicationBuilder

@SpringBootApplication
open class SeafoodFacadeApplication

fun main(args: Array<String>)
{
    SpringApplicationBuilder(SeafoodFacadeApplication::class.java)
        .bannerMode(Banner.Mode.OFF)
        .headless(true)
        .application()
        .run(*args)
}
