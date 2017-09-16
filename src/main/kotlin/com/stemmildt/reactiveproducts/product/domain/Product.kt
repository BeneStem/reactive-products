package com.stemmildt.reactiveproducts.product.domain

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.util.Date

@Document(collection = "products") data class Product(
  @Id val id: String,
  val brand: Brand?,
  val variations: List<Variation>,
  val categories: List<Category>,
  val lastModifiedOfSource: Date,
  val lastModified: Date
)
