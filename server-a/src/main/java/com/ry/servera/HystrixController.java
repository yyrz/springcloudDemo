package com.ry.servera;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HystrixController {
    @Value("${server.port}")
    String port;

    @RequestMapping("/hello")
    @HystrixCommand(fallbackMethod = "hiError")
    public String home(@RequestParam(value = "name", defaultValue = "客户") String name) {
        return "hello " + name + " ,i am from port:" + port;
    }

    public String hiError(String name) {
        return "hello,"+name+",sorry,error!";
    }


}
