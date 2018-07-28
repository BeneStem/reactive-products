package com.stemmildt.reactiveproducts;

import org.springframework.stereotype.Component;
import org.togglz.core.Feature;

import com.breuninger.boot.togglz.FeatureClassProvider;

@Component
public class ReactiveProductsFeatureClassProvider implements FeatureClassProvider {

  @Override
  public Class<? extends Feature> getFeatureClass() {
    return Features.class;
  }
}
