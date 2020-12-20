package in.nareshit.raghu.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

//@Component
public class PostUsingExchangeRunner implements CommandLineRunner {

	public void run(String... args) throws Exception {
		RestTemplate rt = new RestTemplate();
		
		String url="http://localhost:8080/employee/save";
		
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		
		String body = "{\"id\":55,\"name\":\"A\",\"sal\":650.0}";
		
		HttpEntity<String> requestEntity =  new HttpEntity<String>(body, headers);
		
		ResponseEntity<String> resp = rt.exchange(url, HttpMethod.POST, requestEntity, String.class);
		
		System.out.println("Status code - " + resp.getStatusCode().name());
		System.out.println("Status num - " + resp.getStatusCodeValue());
		System.out.println("Response - " + resp.getBody());

		System.exit(0);
		
		
	}

}
