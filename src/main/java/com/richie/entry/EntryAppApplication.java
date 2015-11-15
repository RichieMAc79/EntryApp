package com.richie.entry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EntryAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(EntryAppApplication.class, args);
    }
}
