package com.java_factory_pattern1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ManagementController {

  @GetMapping("/get")
  void getMapping() {
  }
}
