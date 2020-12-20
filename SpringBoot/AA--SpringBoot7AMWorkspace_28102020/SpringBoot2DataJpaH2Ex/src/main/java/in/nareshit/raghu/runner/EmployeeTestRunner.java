package in.nareshit.raghu.runner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.nareshit.raghu.model.Employee;
import in.nareshit.raghu.repo.EmployeeRepository;

@Component
public class EmployeeTestRunner implements CommandLineRunner {
	@Autowired
	private EmployeeRepository repo;

	@Override
	public void run(String... args) throws Exception {
		repo.saveAll(
				Arrays.asList(
						new Employee("A", 2.3),
						new Employee("B", 3.3),
						new Employee("C", 4.4),
						new Employee("D", 5.4),
						new Employee("E", 4.0)
						)
				);
		
		System.out.println(repo.count());
		
		//--stop server--
		System.exit(0);

	}

}
