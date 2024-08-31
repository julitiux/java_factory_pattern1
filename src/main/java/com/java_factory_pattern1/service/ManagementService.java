package com.java_factory_pattern1.service;

import com.java_factory_pattern1.model.ApiRequest;
import com.java_factory_pattern1.model.ClientRequest;
import com.java_factory_pattern1.model.ClientResponse;
import com.java_factory_pattern1.service.impl.ServiceClientFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Component;

@Component
public class ManagementService {

  private final ServiceClientFactory serviceClientFactory;

  public ManagementService(ServiceClientFactory serviceClientFactory) {
    this.serviceClientFactory = serviceClientFactory;
  }

  public void execClient(ApiRequest apiRequest, HttpHeaders httpHeaders) {

    ServiceClient service = serviceClientFactory.getService(apiRequest);
    ClientRequest clientRequest = service.createRequest(apiRequest, httpHeaders);
    ClientResponse clientResponse = service.callService(clientRequest, httpHeaders);

    service.validResponse(clientResponse);

  }

}
