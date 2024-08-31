package com.java_factory_pattern1.service.impl;

import com.java_factory_pattern1.client.MltFeignClient;
import com.java_factory_pattern1.model.ApiRequest;
import com.java_factory_pattern1.model.ClientRequest;
import com.java_factory_pattern1.model.ClientResponse;
import com.java_factory_pattern1.service.AnyService;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;

@Service
public class FinalService extends AnyService {

  protected FinalService(MltFeignClient mltFeignClient) {
    super(mltFeignClient);
  }

  @Override
  public ClientResponse methodFallback(ClientRequest clientRequest, HttpHeaders httpHeaders, Exception exception) {
    return null;
  }

  @Override
  public ClientRequest createRequest(ApiRequest apiRequest, HttpHeaders httpHeaders) {
    return null;
  }

  @Override
  public ClientResponse callService(ClientRequest clientRequest, HttpHeaders httpHeaders) {
    return null;
  }

  @Override
  public void validResponse(ClientResponse clientResponse) {

  }
}
