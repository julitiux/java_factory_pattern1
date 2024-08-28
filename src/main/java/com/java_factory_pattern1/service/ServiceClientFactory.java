package com.java_factory_pattern1.service;

import com.java_factory_pattern1.model.ApiRequest;
import org.springframework.stereotype.Component;

@Component
public class ServiceClientFactory {

  public ServiceClient getService(ApiRequest apiRequest) {
    return null;
  }

}
