package com.stemmildt.reactiveproducts.product.service

import com.stemmildt.reactiveproducts.product.domain.Product
import com.stemmildt.reactiveproducts.product.domain.ProductRepository
import org.springframework.data.domain.Sort
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@Service class ProductService(val productRepository: ProductRepository) {

  fun findAll(sort: Sort): Flux<Product> = productRepository.findAll(sort)

  fun findById(id: String): Mono<Product> = productRepository.findById(id)
}
