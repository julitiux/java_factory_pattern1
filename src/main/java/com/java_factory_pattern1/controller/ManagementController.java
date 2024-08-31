package com.java_factory_pattern1.controller;

import com.java_factory_pattern1.model.ApiRequest;
import com.java_factory_pattern1.service.ManagementService;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ManagementController {

  final private ManagementService managementService;

  public ManagementController(ManagementService managementService) {
    this.managementService = managementService;
  }

  @GetMapping("/get")
  void getMapping(ApiRequest apiRequest, HttpHeaders httpHeaders) {

    managementService.execClient(apiRequest, httpHeaders);

  }
}
