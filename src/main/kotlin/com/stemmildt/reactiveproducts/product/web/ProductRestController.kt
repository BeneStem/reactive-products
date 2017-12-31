package com.stemmildt.reactiveproducts.product.web

import com.stemmildt.reactiveproducts.product.domain.Product
import com.stemmildt.reactiveproducts.product.service.ProductService
import org.springframework.data.domain.Sort
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono
import java.time.Duration

@RestController
@RequestMapping("/products")
class ProductRestController(private val productService: ProductService) {

  @GetMapping
  fun findAll(@RequestParam(name = "take") count: Long, sort: Sort): Flux<Product> = productService.findAll(sort)
    .take(count)
    .delayElements(Duration.ofMillis(500))

  @GetMapping("/{id}")
  fun findById(@PathVariable id: String): Mono<Product> = productService.findById(id)
}
