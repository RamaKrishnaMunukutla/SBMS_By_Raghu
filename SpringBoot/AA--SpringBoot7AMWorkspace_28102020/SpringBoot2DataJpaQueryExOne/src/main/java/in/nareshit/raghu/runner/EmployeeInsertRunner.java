package in.nareshit.raghu.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import in.nareshit.raghu.model.Employee;
import in.nareshit.raghu.repo.EmployeeRepository;

//@Component
public class EmployeeInsertRunner implements CommandLineRunner {
	@Autowired
	private EmployeeRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
		repo.save(new Employee(10, "SAM", 5800.0, "DEV"));
		repo.save(new Employee(11, "ABD", 4800.0, "DEV"));
		repo.save(new Employee(12, "XYZ", 9500.0, "QA"));
		repo.save(new Employee(13, "KNU", 6500.0, "QA"));
		repo.save(new Employee(14, "JFR", 5500.0, "BA"));
		repo.save(new Employee(15, "TTR", 5700.0, "QA"));
		repo.save(new Employee(16, "KLO", 8600.0, "BA"));
		
		System.out.println("____DONE______");
	}

}
