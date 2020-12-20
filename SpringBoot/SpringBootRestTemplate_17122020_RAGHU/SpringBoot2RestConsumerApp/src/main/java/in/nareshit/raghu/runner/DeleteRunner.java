package in.nareshit.raghu.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

//@Component
public class DeleteRunner implements CommandLineRunner {

	public void run(String... args) throws Exception {
		//1. Rest Template object
		RestTemplate rt = new RestTemplate();
		
		//2. URL 
		String url="http://localhost:8080/employee/remove/{id}/{name}";
		
		//3. make Req call and get Response
		// rt.delete(url, 50); //void
		// URL, HttpMethod, Request, ResponseType, pathVariables
		ResponseEntity<String> resp = rt.exchange(url, HttpMethod.DELETE, null, String.class, 5858,"SAM");
		
		//4. print response
		System.out.println("Status code - " + resp.getStatusCode().name());
		System.out.println("Status num - " + resp.getStatusCodeValue());
		System.out.println("Response - " + resp.getBody());

		//5. stop server
		System.exit(0);
		
	}

}
