package in.nareshit.raghu.runner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.nareshit.raghu.repo.EmployeeRepository;

@Component
public class EmployeeTestQueryRunner implements CommandLineRunner {
	@Autowired
	private EmployeeRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
		//repo.getAllEmps().forEach(System.out::println);
		//repo.getAllEmpsByDept("QA").forEach(System.out::println);
		//repo.getAllEmpsByInfo("QA",15).forEach(System.out::println);
		//repo.getAllEmpsByInfo2(10,13).forEach(System.out::println);
		//repo.fetchDatabySql().forEach(System.out::println);
		//repo.getAllEmpsByInfo3(14,10).forEach(System.out::println);
		repo.getAllEmpsById(Arrays.asList(10,13,15,22,48)).forEach(System.out::println);
		
	}

}
