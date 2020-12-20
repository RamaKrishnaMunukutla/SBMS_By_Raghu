package in.nareshit.raghu;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MessageBRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("SAMPLE-B");
	}

}
