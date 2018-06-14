package com.xt.start.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/** Created on 2018/6/14. */
@RestController
public class Start {

  @RequestMapping(value = "/hello")
  public String hello() {
    return "hello world";
  }
}
