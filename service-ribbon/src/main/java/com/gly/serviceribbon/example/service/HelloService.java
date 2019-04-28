package com.gly.serviceribbon.example.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author: create by ggaly
 * @version: v1.0
 * @description: com.gly.serviceribbon.example.service
 * @date:2019/4/26
 **/
@Service
public class HelloService {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "hiError")
    public String hiService(String name) {
        return restTemplate.getForObject("http://SERVICE-HI/hi?name="+name,String.class);
    }

    private String hiError(String name){
        return "hi,"+name+",sorry,error!";
    }
}
