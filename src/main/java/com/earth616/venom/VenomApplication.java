package com.earth616.venom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

//@SpringBootApplication

@SpringBootApplication(scanBasePackages = "com.earth616.venom")
public class VenomApplication {

    public static void main(String[] args) {
        SpringApplication.run(VenomApplication.class, args);
    }

}

