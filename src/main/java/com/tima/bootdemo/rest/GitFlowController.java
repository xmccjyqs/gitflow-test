package com.tima.bootdemo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GitFlowController {

    @GetMapping("/hello")
    public String getString(){
        System.out.println("feature test 0.0.1-SNAPSHOT");
        System.out.println("ddd");
        return "hello gitflow";
    }
}
