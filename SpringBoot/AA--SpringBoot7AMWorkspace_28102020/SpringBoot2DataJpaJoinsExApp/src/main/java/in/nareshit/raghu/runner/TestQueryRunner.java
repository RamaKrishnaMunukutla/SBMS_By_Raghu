package in.nareshit.raghu.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.nareshit.raghu.repo.EmployeeRepository;

@Component
public class TestQueryRunner implements CommandLineRunner {
	@Autowired
	private EmployeeRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
		List<Object[]> list = repo.getDataByClientLJ("HYD");
		//List<Object[]> list = repo.getDataByClientRJ("NIT");
		//List<Object[]> list = repo.getDataByClient("NIT");
		
		for(Object[] ob:list) {
			System.out.println(ob[0]+"-"+ob[1]+"-"+ob[2]);
		}
	}

}
