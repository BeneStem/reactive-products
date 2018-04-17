package com.stemmildt.reactiveproducts.product.domain

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "Produkte")
data class Product(
  @Id val id: String
)
