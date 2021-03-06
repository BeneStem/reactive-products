package com.stemmildt.reactiveproducts

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.PropertySource
import org.springframework.web.servlet.config.annotation.CorsRegistry
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer

@SpringBootApplication
@PropertySource("version.properties")
@ComponentScan("com.breuninger.boot", "com.stemmildt.reactiveproducts")
class Server

fun main(args: Array<String>) {
  runApplication<Server>(*args)
}

@Configuration
class WebMvcConfiguration : WebMvcConfigurer {

  override fun addResourceHandlers(registry: ResourceHandlerRegistry) {
    registry.addResourceHandler("/**").addResourceLocations("classpath:/static/")
  }

  override fun addCorsMappings(registry: CorsRegistry) {
    // TODO also add config for prod and dev on server side and only add this in dev mode
    registry.addMapping("/**").allowedOrigins("http://localhost:3000")
  }
}
