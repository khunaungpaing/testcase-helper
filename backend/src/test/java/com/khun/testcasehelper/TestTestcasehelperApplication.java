package com.khun.testcasehelper;

import org.springframework.boot.SpringApplication;

public class TestTestcasehelperApplication {

    public static void main(String[] args) {
        SpringApplication.from(TestcasehelperApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
