package com.asouwn.demo.controler;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/say")
    public String say(){
        System.out.println("hello");
        return "hello";
    }
}
