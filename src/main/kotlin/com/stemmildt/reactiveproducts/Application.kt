package com.stemmildt.reactiveproducts

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
@ComponentScan("com.breuninger.boot", "com.stemmildt.reactiveproducts")
open class Application

fun main(args: Array<String>) {
  runApplication<Application>(*args)
}
