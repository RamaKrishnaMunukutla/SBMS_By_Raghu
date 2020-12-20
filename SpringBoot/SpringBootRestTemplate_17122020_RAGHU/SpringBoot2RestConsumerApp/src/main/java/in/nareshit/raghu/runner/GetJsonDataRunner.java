package in.nareshit.raghu.runner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import in.nareshit.raghu.model.Employee;

//@Component
public class GetJsonDataRunner implements CommandLineRunner {
	
	private Logger log = LoggerFactory.getLogger(GetJsonDataRunner.class);
	
	@Override
	public void run(String... args) throws Exception {
		RestTemplate rt = new RestTemplate();

		String url= "http://localhost:8080/employee/one/{id}";
		
		//URL, ResponseType, PathVariabless
		ResponseEntity<Employee>  resp = rt.getForEntity(url, Employee.class, 105);
		
		log.info("Status code {}", resp.getStatusCode().name());
		log.info("Status num {}", resp.getStatusCodeValue());
		log.info("Response {}", resp.getBody() ); //JSON
		log.info("Content Type {}", resp.getHeaders().getContentType());
		
		System.exit(0);
		
		
	}

}
