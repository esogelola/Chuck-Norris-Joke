package com.esogelola.chucknorrisjoke;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:chuck-config.xml")
public class ChucknorrisJokeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChucknorrisJokeApplication.class, args);
	}




}
