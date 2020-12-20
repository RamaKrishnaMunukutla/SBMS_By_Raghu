package in.nareshit.raghu.runner;

import java.io.FileInputStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.nareshit.raghu.model.Employee;
import in.nareshit.raghu.repo.EmployeeRepository;

@Component
public class EmployeeLobTestRunner implements CommandLineRunner {
	@Autowired
	private EmployeeRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
		FileInputStream fis = new FileInputStream("F:\\Images\\employee.png");
		//available() returns file size in bytes
		byte[] arr = new byte[fis.available()];
		fis.read(arr);
		
		String info ="AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA";
		char[] edesc = info.toCharArray();
		
		repo.save(new Employee(66, "AA", arr, edesc,"https://s3-ap-southeast-1.amazonaws.com/tv-prod/member/photo/745494-large.jpg"));
		
		fis.close();
	}

}
