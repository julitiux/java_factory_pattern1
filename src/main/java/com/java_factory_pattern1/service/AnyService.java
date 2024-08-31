package com.java_factory_pattern1.service;

import com.java_factory_pattern1.client.MltFeignClient;
import com.java_factory_pattern1.model.ClientRequest;
import com.java_factory_pattern1.model.ClientResponse;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;

@Service
public abstract class AnyService extends ServiceClient {

  protected final MltFeignClient mltFeignClient;

  protected AnyService(MltFeignClient mltFeignClient) {
    this.mltFeignClient = mltFeignClient;
  }

  public abstract  ClientResponse methodFallback(ClientRequest clientRequest, HttpHeaders httpHeaders, Exception exception);

}
