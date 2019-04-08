package com.ry.clientribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloService {

    @Autowired
    RestTemplate ribbonRestTemplate;
    @Autowired
    RestTemplate commonRestTemplate;

    public String ribbon(String name) {
        return ribbonRestTemplate.getForObject("http://SERVICE-A/hi?name="+name,String.class);
    }
    public String common(String name) {
        return commonRestTemplate.getForObject("http://localhost:8762/hi?name="+name,String.class);
    }
}
