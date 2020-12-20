package in.nareshit.raghu.runner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

//@Component
public class ConsumerRunner implements CommandLineRunner {
	
	private Logger log = LoggerFactory.getLogger(ConsumerRunner.class);
	
	@Autowired
	private RestTemplate rt;//HAS-A
	
	@Value("${my.app.provider.ip}")
	private String providerIp;
	
	@Value("${my.app.provider.port}")
	private String providerPort;

	@Override
	public void run(String... args) throws Exception {
		//1. create RestTemplate Object
		//RestTemplate rt = new RestTemplate();

		//2. Define URL
		//String url = "http://localhost:8080/employee/show";
		String url = new StringBuffer()
				.append("http://")
				.append(providerIp)
				.append(":")
				.append(providerPort)
				.append("/employee/show")
				.toString();

		//3. make HTTP call and get Response
		//(URL,ResponseType)
		ResponseEntity<String> resp = rt.getForEntity(url, String.class);

		//4. print details/use them
		log.info("Status code {} " , resp.getStatusCode().name() ); //name
		log.info("Status val {} " , resp.getStatusCodeValue() ); //number
		log.info("Body {} " , resp.getBody() ); //Response

		
		//5. Stop Server (just for test purpose)
		System.exit(0);
		
	}

}
