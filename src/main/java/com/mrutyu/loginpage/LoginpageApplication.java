package com.mrutyu.loginpage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class LoginpageApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoginpageApplication.class, args);
	}

}

