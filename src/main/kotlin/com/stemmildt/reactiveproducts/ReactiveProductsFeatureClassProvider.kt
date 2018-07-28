package com.stemmildt.reactiveproducts;

import com.breuninger.boot.togglz.FeatureClassProvider
import org.springframework.stereotype.Component
import org.togglz.core.Feature

@Component
class ReactiveProductsFeatureClassProvider : FeatureClassProvider {

  override fun getFeatureClass(): Class<out Feature> = Features::class.java
}
