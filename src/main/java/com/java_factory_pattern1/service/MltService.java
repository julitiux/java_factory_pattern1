package com.java_factory_pattern1.service;

import com.fasterxml.jackson.databind.type.MapLikeType;
import com.java_factory_pattern1.client.MltFeignClient;
import com.java_factory_pattern1.model.ApiRequest;
import com.java_factory_pattern1.model.ClientRequest;
import com.java_factory_pattern1.model.ClientResponse;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;

@Service
public abstract class MltService extends ServiceClient {

  protected final MltFeignClient mltFeignClient;

  protected MltService(MltFeignClient mltFeignClient) {
    this.mltFeignClient = mltFeignClient;
  }

  public abstract  ClientResponse methodFallback(ClientRequest clientRequest, HttpHeaders httpHeaders, Exception exception);

}
