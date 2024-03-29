package learn.springboot.whatspringboot;

import learn.springboot.whatspringboot.v13.dao.StudentDAO;
import learn.springboot.whatspringboot.v13.dto.CustomerData;
import learn.springboot.whatspringboot.v13.entity.Student;
import learn.springboot.whatspringboot.v13.service.CustomerService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication(scanBasePackages = { "learn.springboot.whatspringboot.v13", "learn.springboot.whatspringboot.util"} )
@PropertySource("classpath:v13.properties")
public class CrudApplicationV13 {

	public static void main(String[] args) {
		SpringApplication.run(CrudApplicationV13.class, args);
	}



	//@Autowired
	@Bean
	public CommandLineRunner CommandLineRunner(StudentDAO theStudentDAO, CustomerService theCustomerDAO)  {  //(String[] args) {
		return  runner -> {
			System.out.println("------V13---------Hello World ; CommandLineRunner ");

			// only support v13+
//			 createDummyStudents(theStudentDAO);
//			 createDummyCustomer(theCustomerDAO);
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

	private void createDummyCustomer(CustomerService dao) {

		CustomerData temp1 = new CustomerData(1L,"aby", "Koe", "aby@gmail.com");
		CustomerData temp2 = new CustomerData(2L,"Kushi", "Koe", "Kushi@gmail.com");
		CustomerData temp3 = new CustomerData(3L,"Babu", "Drona", "babu@gmail.com");
		CustomerData temp4 = new CustomerData(4L,"Kuyil", "Drona", "aby@gmail.com");

		dao.save(temp1);
		dao.save(temp2);
		dao.save(temp3);
		dao.save(temp4);

	}

}
