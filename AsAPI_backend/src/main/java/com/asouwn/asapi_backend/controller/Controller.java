package com.asouwn.asapi_backend.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class Controller {
    @RequestMapping("hello")
    public String sayHello(){
        log.info("invoke {}", this.getClass().getMethods()[0].getName());
        return "hello";
    }
}
