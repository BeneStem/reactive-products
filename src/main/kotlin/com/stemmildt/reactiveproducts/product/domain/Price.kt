package com.stemmildt.reactiveproducts.product.domain

data class Price (
  val sale: Boolean,
  val retailPrice: Long,
  val suggestedRetailPrice: Long?,
  val oldPrice: Long?
)
