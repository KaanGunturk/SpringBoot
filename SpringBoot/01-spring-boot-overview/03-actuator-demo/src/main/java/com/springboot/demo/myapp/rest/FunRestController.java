package com.springboot.demo.myapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    @GetMapping("/")
    public static String sayHello(){

        return "Hello World";
    }

    //expose a new endpoint

    @GetMapping("/workout")
    public String getDailyWorkout(){
        return "Run a hard 5K";
    }
}
