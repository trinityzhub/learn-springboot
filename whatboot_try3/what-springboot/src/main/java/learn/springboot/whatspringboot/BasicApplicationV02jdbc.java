package learn.springboot.whatspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.PropertySource;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.context.annotation.Bean;


@SpringBootApplication(
		scanBasePackages = { "learn.springboot.whatspringboot.v12"} ,
		exclude = { DataSourceAutoConfiguration.class, JpaRepositoriesAutoConfiguration.class }

)
//@ConfigurationProperties(prefix="v12.properties")
@PropertySource("classpath:v12.properties")
public class BasicApplicationV02jdbc {
	public BasicApplicationV02jdbc() {
		System.out.println("--------v12--------------");
	}

	public static void main(String[] args) {
		SpringApplication.run(BasicApplicationV02jdbc.class, args);
	}


//	// v12
//	@Bean
//	public CommandLineRunner CommandLineRunner(String[] args) {
//		return  runner -> {
//			System.out.println("--------v12-------Hello World ; CommandLineRunner ");
//		};
//	}



}
