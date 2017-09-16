package com.stemmildt.reactiveproducts.product.domain

import org.springframework.data.mongodb.core.mapping.Field

data class Image(
  @Field("id") val id: String
) {
  fun getUriTemplate() = "https://i.otto.de/i/otto/$id?\${format}\$"
}
