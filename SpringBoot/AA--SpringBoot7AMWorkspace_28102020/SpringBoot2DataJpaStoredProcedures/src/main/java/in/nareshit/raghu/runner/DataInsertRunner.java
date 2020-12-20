package in.nareshit.raghu.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import in.nareshit.raghu.model.Employee;
import in.nareshit.raghu.repo.EmployeeRepository;

//@Component
public class DataInsertRunner implements CommandLineRunner {
	@Autowired
	private EmployeeRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
		repo.save(new Employee(101, "SAM", "Lead", "DEV", 86500.0));
		repo.save(new Employee(102, "RAM", "MGR", "DEV", 96000.0));
		repo.save(new Employee(103, "SYED", "ASSOCIATE", "QA", 32500.0));
		repo.save(new Employee(104, "ABD", "MGR", "BA", 55500.0));
	}

}
