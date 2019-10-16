package com.xiang;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
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
    ServiceTest serviceTest;

    @GetMapping(value = "/hi")
    public String hi(@RequestParam String name) {
        String forObject =serviceTest.hi(name);

        return forObject;
    }


}
