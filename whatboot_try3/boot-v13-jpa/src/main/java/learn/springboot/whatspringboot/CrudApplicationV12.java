package learn.springboot.whatspringboot;

import learn.springboot.whatspringboot.v13.dao.StudentDAO;
import learn.springboot.whatspringboot.v13.dto.CustomerData;
import learn.springboot.whatspringboot.v13.entity.Student;
import learn.springboot.whatspringboot.v13.service.CustomerService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication(scanBasePackages = { "learn.springboot.whatspringboot.v12", "learn.springboot.whatspringboot.util"} )
//@ConfigurationProperties(prefix="v12.properties")
//@PropertySource("classpath:v12.properties")
public class CrudApplicationV12 {

	public static void main(String[] args) {
		SpringApplication.run(CrudApplicationV12.class, args);
	}


	// v12
	@Bean
	public CommandLineRunner CommandLineRunner(String[] args) {
		return  runner -> {
			System.out.println("--------v12-------Hello World ; CommandLineRunner ");
		};
	}



}
