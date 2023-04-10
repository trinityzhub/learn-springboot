package learn.springboot.whatspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = { "learn.springboot.whatspringboot.V12", "earn.springboot.whatspringboot.util"} )
public class WhatSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(WhatSpringbootApplication.class, args);
	}

}
