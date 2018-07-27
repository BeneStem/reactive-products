package com.stemmildt.reactiveproducts

import org.togglz.core.Feature
import org.togglz.core.context.FeatureContext

enum class Features : Feature {

  TEST_TOGGLE;

  override fun id(): String = this.name

  fun isActive(): Boolean = FeatureContext.getFeatureManager().isActive(this)
}
