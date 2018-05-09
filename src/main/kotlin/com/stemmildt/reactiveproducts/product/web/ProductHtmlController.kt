package com.stemmildt.reactiveproducts.product.web

import io.micrometer.core.annotation.Timed
import org.springframework.http.MediaType.TEXT_HTML_VALUE
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.servlet.ModelAndView

@Controller
@RequestMapping("/products")
class ProductHtmlController {

  @Timed("html.products.findAll")
  @GetMapping(produces = [TEXT_HTML_VALUE])
  fun findAll(): ModelAndView = ModelAndView("productOverviewPage.html")
}
