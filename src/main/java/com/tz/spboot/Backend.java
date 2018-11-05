package com.tz.spboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@EnableAutoConfiguration
@RestController
public class Backend {

    @GetMapping("/api") public String printDate() {
        return new Date().toString() + " by hongxi";
    }

    public static void main(String[] args) {
        SpringApplication.run(Backend.class,
                "--spring.application.name=backend",
                "--server.port=9000"
        );
    }


}



