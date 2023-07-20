package com.fiveta.springboot.demo.springbootdemo.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//Apiler rest controller içerisine yazılır
@RestController
public class FunRestController {
    //özellikleri dahil etmek (application.properties dosyasından)
    @Value("${coach.name}")
    private String coachName;
    @Value("${team.name}")
    private String teamName;


    @GetMapping("/team-info")
    public String getTeamInfo(){
        return "Coach: "+ coachName + " , Team name: "+ teamName;
    }

    @GetMapping("/") // "/" işaretinde çalışacak olan fonksiyon
    public String sayHello(){
        return "Hello World";
    }

    @GetMapping("work")
    public String work(){
        return "Working";
    }
}
