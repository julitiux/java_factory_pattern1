package com.java_factory_pattern1.service;

import com.java_factory_pattern1.model.ApiRequest;
import com.java_factory_pattern1.service.impl.FinalService;
import org.springframework.stereotype.Component;

@Component
public class ServiceClientFactory {

  private final FinalService finalService;

  public ServiceClientFactory(FinalService finalService) {
    this.finalService = finalService;
  }

  public ServiceClient getService(ApiRequest apiRequest) {

    return finalService;

  }

}
