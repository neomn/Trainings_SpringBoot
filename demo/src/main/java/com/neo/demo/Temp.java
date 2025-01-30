package com.neo.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Temp {

    @GetMapping(path="/hi")
    public String test (){
        return "hey there";
    }
}
