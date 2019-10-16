package com.xiang;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

/**
 * @author steel
 * @date 2019/9/3
 */
@Service
public class ServiceTest {

    @Autowired
    RestTemplate restTemplate;


    @HystrixCommand(fallbackMethod = "hiError")
    public String hi(String name) {
        String forObject = restTemplate.getForObject("http://SERVICE-CLIENT-1/hi?name=" + name, String.class);

        return forObject+"1111";
    }

    public String hiError(String name){
        return "hi,"+name+",sorry  error";
    }
}
