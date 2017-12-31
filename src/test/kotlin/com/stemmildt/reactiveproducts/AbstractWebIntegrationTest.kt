package com.stemmildt.reactiveproducts

import org.junit.Before
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT
import org.springframework.boot.web.server.LocalServerPort
import org.springframework.test.web.reactive.server.WebTestClient

@SpringBootTest(webEnvironment = RANDOM_PORT)
abstract class AbstractWebIntegrationTest : AbstractIntegrationTest() {

  @LocalServerPort private var port: Int? = null

  lateinit var client: WebTestClient

  @Before
  fun setupWebTestClient() {
    client = WebTestClient.bindToServer()
      .baseUrl("http://localhost:$port")
      .build()
  }
}
