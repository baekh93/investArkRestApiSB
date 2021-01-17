package com.ark;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class startApp {

    //static 메모리에 제일먼저 올라감
    public static void main(String[] args) {
        SpringApplication.run(startApp.class, args); // 스프링 어플리케이션을 실행하겠다.
    }
}
