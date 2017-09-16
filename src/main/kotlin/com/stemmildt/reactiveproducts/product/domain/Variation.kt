package com.stemmildt.reactiveproducts.product.domain

import org.springframework.data.mongodb.core.mapping.Field

data class Variation(
  @Field("id") val id: String,
  val articleNumber: String,
  val productUrl: String,
  val name: String,
  val price: Price,
  val availability: Availability,
  val images: List<Image>,
  val dimensions: List<Dimension>,
  val energyEfficiencyClass: EnergyEfficiencyClass?
)
