package in.nareshit.raghu.runner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import in.nareshit.raghu.model.Employee;

//@Component
public class PostDataRunner implements CommandLineRunner {

	private Logger log = LoggerFactory.getLogger(PostDataRunner.class);
	
	@Override
	public void run(String... args) throws Exception {
		RestTemplate rt = new RestTemplate();
		
		String url = "http://localhost:8080/employee/save";
		
		//Request Header
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		
		// Request Body
		//String body="{\"id\":55,\"name\":\"AA\",\"sal\":330.0}";
		Employee body = new Employee(9898, "MNOP", 550.0);
		
		//prepare request-entity(body+header)
		//HttpEntity<String> request = new HttpEntity<String>(body,headers);
		HttpEntity<Employee> request = new HttpEntity<Employee>(body,headers);
		
		//URL, RequestEntity, ResponseType
		ResponseEntity<String> resp = rt.postForEntity(url, request, String.class);
		
		//print details
		log.info("Status code {}", resp.getStatusCode().name());
		log.info("Status num {}", resp.getStatusCodeValue());
		log.info("Response {}",  resp.getBody());
		
		System.exit(0);
	}

}
