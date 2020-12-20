package in.nareshit;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MessageDRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("SAMPLE-D");
	}

}
