package com.java_factory_pattern1.client;

import com.java_factory_pattern1.model.ApiRequest;

  public interface MltFeignClient {

  void save(ApiRequest apiRequest);

  void delete(ApiRequest apiRequest);

  void find(ApiRequest apiRequest);

  void update(ApiRequest apiRequest);

}
