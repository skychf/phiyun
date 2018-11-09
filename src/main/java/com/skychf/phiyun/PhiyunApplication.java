package com.skychf.phiyun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class PhiyunApplication {

    public static void main(String[] args) {
        SpringApplication.run(PhiyunApplication.class, args);
    }
}
