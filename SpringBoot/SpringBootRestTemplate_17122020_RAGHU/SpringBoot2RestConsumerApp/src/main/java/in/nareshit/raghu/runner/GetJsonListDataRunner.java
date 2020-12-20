package in.nareshit.raghu.runner;

import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import in.nareshit.raghu.model.Employee;

//@Component
public class GetJsonListDataRunner implements CommandLineRunner {
	
	private Logger log = LoggerFactory.getLogger(GetJsonListDataRunner.class);
	
	@Override
	public void run(String... args) throws Exception {
		RestTemplate rt = new RestTemplate();

		String url= "http://localhost:8080/employee/all";
		
		//URL, ResponseType, PathVariabless
		ResponseEntity<Employee[]>  resp = rt.getForEntity(url, Employee[].class, 105);
		
		//read array
		Employee[]  emps = resp.getBody();
		
		//convert to List
		List<Employee> list  = Arrays.asList(emps);
		//List<Employee> list  = List.of(emps);
		
		log.info("Status code {}", resp.getStatusCode().name());
		log.info("Status num {}", resp.getStatusCodeValue());
		log.info("Response {}",  list); //JSON
		log.info("Content Type {}", resp.getHeaders().getContentType());
		
		System.exit(0);
		
		
	}

}
