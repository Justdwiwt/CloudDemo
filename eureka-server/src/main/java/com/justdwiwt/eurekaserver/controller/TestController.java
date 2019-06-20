package com.justdwiwt.eurekaserver.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Value("${server.port}")
    private int port;

    @RequestMapping("index")
    public String index() {
        return "success, port: " + port;
    }

}
