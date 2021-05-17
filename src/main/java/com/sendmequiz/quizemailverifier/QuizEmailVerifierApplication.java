package com.sendmequiz.quizemailverifier;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class QuizEmailVerifierApplication {

    public static void main(String[] args) {
        SpringApplication.run(QuizEmailVerifierApplication.class, args);
    }

}
