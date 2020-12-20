package in.nareshit.raghu.runner;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import in.nareshit.raghu.repo.EmployeeRepository;

//@Component
public class EmployeeDateTestRunner implements CommandLineRunner {
	@Autowired
	private EmployeeRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
		Date dt = new Date(System.currentTimeMillis());
		
		//Employee emp = new Employee(55, "SAM", dt, dt, dt);
		/*
		SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yy hh:mm");
		String dts = sdf.format(dt);
		System.out.println(dts);
		*/
		
		//repo.save(emp);
	}
}
