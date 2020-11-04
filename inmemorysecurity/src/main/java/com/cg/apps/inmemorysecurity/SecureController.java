package com.cg.apps.inmemorysecurity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/c")
@RestController
public class SecureController {

    @GetMapping("/hello")
    public String greetHello(){
        return "secure hello";
    }

    @GetMapping("/hi")
    public String greetHi(){
        return "secure hi";
    }

}
