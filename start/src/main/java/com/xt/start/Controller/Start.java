package com.xt.start.Controller;

import com.xt.start.Bean.Cat;
import com.xt.start.dao.CatDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/** Created on 2018/6/14. */
@RestController
public class Start {

  @Autowired private CatDB catDB;

  @RequestMapping(value = "/hello")
  public String hello() {
    return "hello world6";
  }

  @PostMapping(value = "/catinfo")
  public void saveCatInfo() {
    Cat cat = new Cat(1, "mimi", 1);
    catDB.insertCatInfo(cat);
  }
}
