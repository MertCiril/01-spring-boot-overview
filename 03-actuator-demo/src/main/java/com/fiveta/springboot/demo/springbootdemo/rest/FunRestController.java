package com.fiveta.springboot.demo.springbootdemo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//Apiler rest controller içerisine yazılır
@RestController
public class FunRestController {
    @GetMapping("/") // "/" işaretinde çalışacak olan fonksiyon
    public String sayHello(){
        return "Hello World";
    }

    @GetMapping("work")
    public String work(){
        return "Working";
    }
}
