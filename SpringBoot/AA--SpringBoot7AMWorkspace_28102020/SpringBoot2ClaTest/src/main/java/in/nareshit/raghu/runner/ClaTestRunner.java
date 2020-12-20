package in.nareshit.raghu.runner;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ClaTestRunner implements CommandLineRunner {
	@Value("${title}")
	private String title;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("FROM RUNNER");
		System.out.println(title);
	}

}
