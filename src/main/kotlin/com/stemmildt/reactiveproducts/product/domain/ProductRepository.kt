package com.stemmildt.reactiveproducts.product.domain

import org.springframework.data.repository.reactive.ReactiveSortingRepository

interface ProductRepository : ReactiveSortingRepository<Product, String>
