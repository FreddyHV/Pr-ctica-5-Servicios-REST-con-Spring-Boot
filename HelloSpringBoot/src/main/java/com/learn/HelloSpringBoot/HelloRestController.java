package com.learn.HelloSpringBoot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {

  @RequestMapping("/hola")
  public String hello() {
    return "Holaaaaaa alumno promedio u.u";
  }
}