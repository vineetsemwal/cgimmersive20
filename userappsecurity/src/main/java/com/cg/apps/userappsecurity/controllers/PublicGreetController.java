package com.cg.apps.userappsecurity.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/p")
@RestController
public class PublicGreetController {

    @GetMapping("/hello")
    public String greetHello(){
        return "public hello";
    }

    @GetMapping("/hi")
    public String greetHi(){
        return "public hi";
    }

}
