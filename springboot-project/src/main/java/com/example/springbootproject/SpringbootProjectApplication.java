package com.example.springbootproject;

import com.example.springbootproject.model.Employee;
import com.example.springbootproject.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootProjectApplication  implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootProjectApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {
		Employee employee = new Employee();
		employee.setFirstName("Prasad");
		employee.setLastName("Mudhiraj");
		employee.setEmailId("prasad@gmail.com");
		employeeRepository.save(employee);

		Employee employee1 = new Employee();
		employee1.setFirstName("Sai");
		employee1.setLastName("Naveen");
		employee1.setEmailId("sai@gmail.com");
		employeeRepository.save(employee1);

	}
}
