import org.springframework.cloud.contract.spec.Contract

Contract.make {
    request {
        method 'GET'
        url '/product?halibut'
        headers {
            accept 'application/json'
        }
    }

    response {
        status 200
        headers {
            contentType 'application/json'
        }
        body {
            product
        }
    }
}
