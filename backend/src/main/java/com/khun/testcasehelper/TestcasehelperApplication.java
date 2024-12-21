package com.khun.testcasehelper;

import com.khun.testcasehelper.auth.AuthenticationService;
import com.khun.testcasehelper.auth.RegisterRequest;
import com.khun.testcasehelper.entity.UserRole;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
public class TestcasehelperApplication {
    public static void main(String[] args) {
        SpringApplication.run(TestcasehelperApplication.class, args);
    }
}
