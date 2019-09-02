package com.xiang;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author steel
 * @date 2019/9/2
 */

@RestController
public class ControllerTest {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping(value = "/hi")
    public String hi(@RequestParam String name) {
        String forObject = restTemplate.getForObject("http://SERVICE-CLIENT-1/hi?name=" + name, String.class);

        return forObject;
    }
}
