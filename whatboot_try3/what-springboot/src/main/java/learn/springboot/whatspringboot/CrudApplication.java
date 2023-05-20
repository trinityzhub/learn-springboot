package learn.springboot.whatspringboot;

import learn.springboot.whatspringboot.v13.dao.StudentDAO;
import learn.springboot.whatspringboot.v13.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(scanBasePackages = { "learn.springboot.whatspringboot.v13", "learn.springboot.whatspringboot.util"} )
public class CrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudApplication.class, args);
	}

	//@Autowired
	@Bean
	public CommandLineRunner CommandLineRunner(StudentDAO theStudentDAO)  {  //(String[] args) {
		return  runner -> {
			System.out.println("---------------Hello World ; CommandLineRunner ");
			// createDummyStudents(theStudentDAO);
		};
	}


	private void createDummyStudents(StudentDAO dao) {

		Student temp1 = new Student("aby", "Koe", "aby@gmail.com");
		Student temp2 = new Student("Kushi", "Koe", "Kushi@gmail.com");
		Student temp3 = new Student("Babu", "Drona", "babu@gmail.com");
		Student temp4 = new Student("Kuyil", "Drona", "aby@gmail.com");

		dao.save(temp1);
		dao.save(temp2);
		dao.save(temp3);
		dao.save(temp4);
		
	}
	

}
