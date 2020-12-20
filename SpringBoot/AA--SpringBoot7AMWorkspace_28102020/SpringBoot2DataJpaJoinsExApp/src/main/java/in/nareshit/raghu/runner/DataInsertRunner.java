package in.nareshit.raghu.runner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import in.nareshit.raghu.model.Employee;
import in.nareshit.raghu.model.Project;
import in.nareshit.raghu.repo.EmployeeRepository;
import in.nareshit.raghu.repo.ProjectRepository;

//@Component
public class DataInsertRunner implements CommandLineRunner {
	@Autowired
	private EmployeeRepository erepo;
	@Autowired
	private ProjectRepository prepo;
	
	@Override
	public void run(String... args) throws Exception {
		
		
		Project p1 = new Project(55, "P1", 5000.0, "HTC");
		Project p2 = new Project(56, "P2", 6000.0, "NIT");
		Project p3 = new Project(57, "P3", 5800.0, "XYZ");
		Project p4 = new Project(58, "P4", 4200.0, "NIT");
		Project p5 = new Project(59, "P5", 9800.0, "HTC");
		
		prepo.save(p1);
		prepo.save(p2);
		prepo.save(p3);
		prepo.save(p4);
		prepo.save(p5);
		
		
		Employee e1 = new Employee(10, "A", 3.3, "HYD", null);
		Employee e2 = new Employee(11, "B", 3.4, "CHN", null);
		Employee e3 = new Employee(12, "C", 4.6, "DHL", Arrays.asList(p2));
		Employee e4 = new Employee(13, "D", 5.8, "BAN", null);
		Employee e5 = new Employee(14, "E", 6.8, "HYD", Arrays.asList(p3));
		
		erepo.save(e1);
		erepo.save(e2);
		erepo.save(e3);
		erepo.save(e4);
		erepo.save(e5);
		
	}

}
