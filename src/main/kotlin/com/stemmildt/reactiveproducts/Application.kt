package com.stemmildt.reactiveproducts

import org.springframework.boot.SpringApplication.run
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication @ComponentScan("com.stemmildt.reactiveproducts") open class Application

fun main(args: Array<String>) {
  run(Application::class.java, *args)
}
