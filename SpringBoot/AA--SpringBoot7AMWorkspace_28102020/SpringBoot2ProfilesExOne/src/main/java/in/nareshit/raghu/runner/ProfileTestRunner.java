package in.nareshit.raghu.runner;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ProfileTestRunner implements CommandLineRunner {

	@Value("${dbname}")
	private String dbn;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("FROM CLR : " + dbn);
	}

}
