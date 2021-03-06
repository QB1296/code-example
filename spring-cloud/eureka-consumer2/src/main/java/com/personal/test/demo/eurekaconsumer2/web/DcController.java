package com.personal.test.demo.eurekaconsumer2.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class DcController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/consumer")
    public String dc() {
        return "From consumer2: " + restTemplate.getForObject("http://eureka-client/dc", String.class);
    }
}