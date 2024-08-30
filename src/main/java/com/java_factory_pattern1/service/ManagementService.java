package com.java_factory_pattern1.service;

import com.java_factory_pattern1.model.ApiRequest;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Component;

@Component
public class ManagementService {

  private final ServiceClientFactory serviceClientFactory;

  public ManagementService(ServiceClientFactory serviceClientFactory) {
    this.serviceClientFactory = serviceClientFactory;
  }

  public void execClient(ApiRequest apiRequest, HttpHeaders httpHeaders) {
  }

}
