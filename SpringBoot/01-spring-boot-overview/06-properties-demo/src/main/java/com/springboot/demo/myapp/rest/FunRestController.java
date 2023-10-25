package com.springboot.demo.myapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    @GetMapping("/teaminfo")
    public String getTeamInfo(){
        return coachName + teamName;
    }

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
