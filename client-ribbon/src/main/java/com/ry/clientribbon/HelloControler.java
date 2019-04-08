package com.ry.clientribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControler {

    @Autowired
    HelloService helloService;

    @GetMapping(value = "/ribbon")
    public String ribbon(@RequestParam String name) {
        return helloService.ribbon( name )+"  from ribbon";
    }

    @GetMapping(value = "/common")
    public String common(@RequestParam String name) {
        return helloService.common( name )+"  from ribbon";
    }
}
