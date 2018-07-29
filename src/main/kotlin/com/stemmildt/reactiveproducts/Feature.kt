package com.stemmildt.reactiveproducts;

import com.breuninger.boot.togglz.FeatureClassProvider
import org.springframework.stereotype.Component
import org.togglz.core.context.FeatureContext

enum class Feature {
  REST_PRODUCTS_FINDALL;

  fun isActive() = FeatureContext.getFeatureManager().isActive { name }
}

@Component
class FeaturesClassProvider : FeatureClassProvider {
  override fun getFeatureClass() = Feature::class.java
}
