package com.bootcoding.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class JPAApp implements ApplicationRunner {
    public static void main(String[] args) {
        //System.out.println("i am here");
        SpringApplication.run(JPAApp.class, args);

    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("i am present in jpa app");
    }
}
