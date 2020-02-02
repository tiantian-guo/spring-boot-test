package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("/test1")
    public String test1(){
        return "hello word";
    }

    @GetMapping("/baobiao")
    public String baobiao(){
        return "我是报表分支";
    }
}
