package com.eidiko;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;


@SpringBootApplication
@EnableScheduling
public class SpBootSchedulingApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpBootSchedulingApplication.class, args);
		System.out.println("Main application starts on :"+new Date());
	}

}
