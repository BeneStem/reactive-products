package com.stemmildt.reactiveproducts

import com.breuninger.boot.togglz.FeatureClassProvider
import org.springframework.stereotype.Component

@Component
class ArchPlaygroundFeatureClassProvider : FeatureClassProvider {

  override fun getFeatureClass(): Class<Features> = Features::class.java
}
