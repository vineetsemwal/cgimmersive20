package com.cg.apps.inmemorysecurity;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/m")
@RestController
public class ManagerController {

    @GetMapping("/hello")
    public String greetHello(){
        return "hello from manager";
    }

    @GetMapping("/hi")
    public String greetHi(){
        return "hi from manager";
    }

}
