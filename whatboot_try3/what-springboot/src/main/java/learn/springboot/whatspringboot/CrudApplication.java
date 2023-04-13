package learn.springboot.whatspringboot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(scanBasePackages = { "learn.springboot.whatspringboot.v13", "learn.springboot.whatspringboot.util"} )
public class CrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudApplication.class, args);
	}

	@Bean
	public CommandLineRunner CommandLineRunner(String[] args) {
		return  runner -> {
			System.out.println("---------------Hello World ; CommandLineRunner ");
		};
	}
}
