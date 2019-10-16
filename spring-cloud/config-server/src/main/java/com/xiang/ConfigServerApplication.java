package com.xiang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author steel
 * @date 2019/9/3
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigServerApplication {


    public static void main(String[] args) {
        SpringApplication.run(ConfigServerApplication.class, args);
    }


}
