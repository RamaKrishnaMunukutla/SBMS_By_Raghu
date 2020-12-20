package in.nareshit.raghu.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

//@Component
public class UpdateRunner implements CommandLineRunner {

	public void run(String... args) throws Exception {
		
		RestTemplate rt = new RestTemplate();
		
		String url="http://localhost:8080/employee/modify/{id}";
		
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		
		String body="{\"name\":\"SAM\",\"sal\":500.0}";
		
		HttpEntity<String> requestEntity = new HttpEntity<>(body, headers);
		
		//URL, reqMethod, reqEntity, ResponseType, pathVariables
		ResponseEntity<String> resp = rt.exchange(url, HttpMethod.PUT, requestEntity, String.class, 500);
		
		
		System.out.println("Status code - " + resp.getStatusCode().name());
		System.out.println("Status num - " + resp.getStatusCodeValue());
		System.out.println("Response - " + resp.getBody());

		System.exit(0);
		
	}

}
