package in.nareshit.raghu.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.nareshit.raghu.repo.EmployeeRepository;

@Component
public class EmployeeQueryProjectionTestRunner implements CommandLineRunner {
	@Autowired
	private EmployeeRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
		//List<Employee> list = repo.getAllEmployees();
		//List<String> list = repo.getAllEmployeeNames();
		//list.forEach(System.out::println);
		/*
		List<Object[]> list = repo.getAllEmployeeNameAndSal();
		
		list
		.stream()
		.map(ob->ob[0]+"/"+ob[1]) // converts one type to another type
		.forEach(System.out::println);
		
		for(Object[] ob:list) {
			System.out.println(ob[0]+"-"+ob[1]);
		}*/
		
		//Employee e = repo.getEmployeeById(101);	System.out.println(e);
		
		//Object ob[] = (Object[])repo.getEmployeeNameAndSalById(102);	System.out.println(ob[0]+"-"+ob[1]);
		
		//String name = repo.getEmployeeNameById(103);	System.out.println(name);
		
		String s = repo.getEmployeeNameByDept("DEV");
		System.out.println(s);
	}

}
