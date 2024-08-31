package com.java_factory_pattern1.service.impl;

import com.java_factory_pattern1.model.ApiRequest;
import com.java_factory_pattern1.service.ServiceClient;
import org.springframework.stereotype.Component;

@Component
public class ServiceClientFactory {

  private final MltService mltService;

  public ServiceClientFactory(MltService finalService) {
    this.mltService = finalService;
  }

  public ServiceClient getService(ApiRequest apiRequest) {

    return mltService;

  }

}
