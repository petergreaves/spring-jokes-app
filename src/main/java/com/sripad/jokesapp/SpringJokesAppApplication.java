package com.sripad.jokesapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"guru.springframework.norris.chuck.ChuckNorrisQuotes"})
public class SpringJokesAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringJokesAppApplication.class, args);
	}

}
