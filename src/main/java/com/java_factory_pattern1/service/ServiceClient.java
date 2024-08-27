package com.java_factory_pattern1.service;

import com.java_factory_pattern1.model.ApiRequest;
import com.java_factory_pattern1.model.ClientRequest;
import org.springframework.http.HttpHeaders;

public abstract class ServiceClient {

  public abstract ClientRequest createRequest(ApiRequest apiRequest, HttpHeaders httpHeaders);

}
