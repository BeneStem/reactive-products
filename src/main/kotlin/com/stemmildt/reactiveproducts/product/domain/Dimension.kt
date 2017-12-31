package com.stemmildt.reactiveproducts.product.domain

data class Dimension(
  val type: Type,
  val colorName: String,
  val baseColor: String?
)

enum class Type {
  COLOR
}
