package com.stemmildt.reactiveproducts

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.PropertySource

@SpringBootApplication
@PropertySource("version.properties")
@ComponentScan("com.breuninger.boot", "com.stemmildt.reactiveproducts")
open class Application

fun main(args: Array<String>) {
  runApplication<Application>(*args)
}
