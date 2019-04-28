package com.gly.serviceribbon.example.web;

import com.gly.serviceribbon.example.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: create by ggaly
 * @version: v1.0
 * @description: com.gly.serviceribbon.example.web
 * @date:2019/4/26
 **/
@RestController
public class HelloControler {

    @Autowired
    private HelloService helloService;

    @GetMapping("/hi")
    public String hello(String name){
        return helloService.hiService(name);
    }
}
