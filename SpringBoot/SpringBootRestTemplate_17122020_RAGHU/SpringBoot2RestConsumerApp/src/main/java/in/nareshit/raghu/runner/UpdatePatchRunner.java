package in.nareshit.raghu.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class UpdatePatchRunner implements CommandLineRunner {

	public void run(String... args) throws Exception {
		
		RestTemplate rt = new RestTemplate();
		
		String url="http://localhost:8080/employee/update/{id}/{name}";
		
		
		//URL, reqMethod, reqEntity, ResponseType, pathVariables
		String  resp = rt.patchForObject(url, null, String.class, 90,"A");
		//ResponseEntity<String> resp = rt.exchange(url, HttpMethod.PATCH, null, String.class, 989,"ABC");
		
		
		System.out.println(resp);
		/*
		System.out.println("Status code - " + resp.getStatusCode().name());
		System.out.println("Status num - " + resp.getStatusCodeValue());
		System.out.println("Response - " + resp.getBody());
		*/
		
		System.exit(0);
		
	}

}
