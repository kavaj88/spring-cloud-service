package com.kevin.spring;

import com.kevin.spring.entity.Perpson;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@RestController
public class CloudServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudServiceApplication.class, args);
    }

    @Value("${server.port}")
    String port;

    @GetMapping("/hi")
    public String home(@RequestParam(value = "name", defaultValue = "forezp") String name) {
        return "hi " + name + " ,i am from port:" + port;
    }


    @PostMapping("/hi")
    public String home(@RequestBody Perpson p) {
        return p.toString();
    }

}
