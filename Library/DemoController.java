package com.learning.emp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

@Value("${spring.info}")
    private String message= "welcome to advance java";
    @GetMapping("/info")
    public String getInfo(){

        return this.message;
    }
}
