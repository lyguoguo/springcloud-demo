package com.example.sericefeign.example.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author: create by ggaly
 * @version: v1.0
 * @description: com.example.sericefeign.example.service
 * @date:2019/4/26
 **/
@FeignClient(value = "service-hi",fallback = SchedualServiceHiHystric.class)
public interface SchedualServiceHi {

    @GetMapping("/hi")
    public String sayHiFromClientOne(@RequestParam("name") String name);

}
