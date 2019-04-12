package com.gly;/**
 * Created by gly on 2019-4-12.
 *
 * @author
 */

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Project : springcloud-demo
 * @Package Name : com.gly
 * @author guoguo
 * @Description:
 * @Author gly on 2019-4-12 13:20.
 */
@RestController
public class HomeController {

    @Value("${server.port}")
    private String serverPort;

    @RequestMapping("/hi")
    public String home(@RequestParam(value = "name", defaultValue = "forezp") String name){
        return "hi " + name + " ,i am from port:" + serverPort;
    }
}
