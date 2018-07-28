package com.stemmildt.reactiveproducts;

import org.togglz.core.Feature;
import org.togglz.core.annotation.Label;
import org.togglz.core.context.FeatureContext;

enum Features implements Feature {

  /**
   * Usage in thymeleaf template:
   * th:if="${T(com.breuninger.arch.playground.toggle.domain.Features).TEST_TOGGLE.active}"
   * Usage in Tests:
   * FeatureManagerSupport.allDisabledFeatureConfig(Features.class);
   * FeatureManagerSupport.enable(TEST_TOGGLE);
   */

  @Label("FEATURE_TEST") FEATURE_TEST;

  public boolean isActive() {
    return FeatureContext.getFeatureManager().isActive(this);
  }
}
