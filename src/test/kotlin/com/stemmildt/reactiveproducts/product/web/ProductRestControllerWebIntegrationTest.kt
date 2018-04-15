package com.stemmildt.reactiveproducts.product.web

import com.natpryce.hamkrest.assertion.assert
import com.natpryce.hamkrest.equalTo
import com.nhaarman.mockito_kotlin.argumentCaptor
import com.nhaarman.mockito_kotlin.given
import com.stemmildt.reactiveproducts.AbstractWebIntegrationTest
import com.stemmildt.reactiveproducts.product.domain.Brand
import com.stemmildt.reactiveproducts.product.domain.Product
import com.stemmildt.reactiveproducts.product.service.ProductService
import org.junit.Ignore
import org.junit.Test
import org.springframework.boot.test.mock.mockito.MockBean
import org.springframework.data.domain.Sort
import org.springframework.data.domain.Sort.Direction.DESC
import org.springframework.data.domain.Sort.unsorted
import org.springframework.http.MediaType.TEXT_EVENT_STREAM
import org.springframework.test.web.reactive.server.returnResult
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono
import reactor.test.StepVerifier
import java.util.Date

@Ignore
internal class ProductRestControllerWebIntegrationTest : AbstractWebIntegrationTest() {

  @MockBean private lateinit var productServiceMock: ProductService

  @Test
  fun `Find all products`() {
    // given
    val productId1 = "100334202"
    val productId2 = "100334203"
    val sortArgumentCaptor = argumentCaptor<Sort>()
    given(productServiceMock.findAll(sortArgumentCaptor.capture())).willReturn(Flux.just(
      Product(productId1, Brand("testBrand"), listOf(), listOf(), Date(), Date()),
      Product(productId2, Brand("testBrand"), listOf(), listOf(), Date(), Date())))

    // when
    val result = client.get().uri("/products?take=10&sort=id,desc")
      .accept(TEXT_EVENT_STREAM)
      .exchange()
      .returnResult<Product>()

    // then
    assert.that(sortArgumentCaptor.firstValue.getOrderFor("id")!!.direction, equalTo(DESC))
    StepVerifier.create(result.responseBody)
      .consumeNextWith({ assert.that(it.id, equalTo(productId1)) })
      .consumeNextWith({ assert.that(it.id, equalTo(productId2)) })
      .verifyComplete()
  }

  @Test
  fun `Find no products`() {
    // given
    given(productServiceMock.findAll(unsorted())).willReturn(Flux.empty())

    // when
    val result = client.get().uri("/products?take=10")
      .accept(TEXT_EVENT_STREAM)
      .exchange()
      .returnResult<Product>()

    // then
    StepVerifier.create(result.responseBody)
      .verifyComplete()
  }

  @Test
  fun `Find product by id`() {
    // given
    val productId = "100334204"
    given(productServiceMock.findById(productId)).willReturn(Mono.just(
      Product(productId, Brand("testBrand"), listOf(), listOf(), Date(), Date())))

    // when
    val result = client.get().uri("/products/$productId")
      .exchange()
      .returnResult<Product>()

    // then
    StepVerifier.create(result.responseBody)
      .consumeNextWith { assert.that(it.id, equalTo(productId)) }
      .verifyComplete()
  }

  @Test
  fun `Find no product by id`() {
    // given
    val productId = "100334200"
    given(productServiceMock.findById(productId)).willReturn(Mono.empty())

    // when
    val result = client.get().uri("/products/$productId")
      .exchange()
      .returnResult<String>()

    // then
    StepVerifier.create(result.responseBody)
      .verifyComplete()
  }
}
