package com.tz.spboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@EnableAutoConfiguration
@RestController
@CrossOrigin
public class Frontend {


    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/") public String callBackend() {
        return restTemplate.getForObject("http://localhost:9000/api", String.class);
    }

    @Bean
    RestTemplate restTemplate() {
        return new RestTemplate();
    }

    public static void main(String[] args) {
        SpringApplication.run(Frontend.class,
                "--spring.application.name=frontend",
                "--server.port=8081"
        );
    }



}
