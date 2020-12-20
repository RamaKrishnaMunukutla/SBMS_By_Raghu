package in.nareshit.raghu.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import in.nareshit.raghu.repo.EmployeeRepository;

//@Component
public class EmployeeRunner implements CommandLineRunner {
	@Autowired
	private EmployeeRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
		/*
		repo.saveAll(Arrays.asList(
				new Employee(101,"SAM","DEV",300.0),
				new Employee(102,"SYED","DEV",400.0),
				new Employee(103,"RAM","QA",300.0),
				new Employee(104,"JAY","HR",400.0),
				new Employee(105,"KIRAN","QA",800.0),
				new Employee(106,"OM","BA",400.0)
				));
		
		List<Employee> list = repo.findAll();
		list.forEach(System.out::println);
		
		System.out.println("----------------------------");
		
		Employee emp = new Employee();
		emp.setDept("DEV");
		emp.setSal(400.0);
		
		Example<Employee> ex = Example.of(emp);
		
		List<Employee> list2 = repo.findAll(ex);
		list2.forEach(System.out::println);
		*/
	}

}
