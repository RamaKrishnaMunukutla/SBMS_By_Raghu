package in.nareshit.raghu.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(20)
public class MessageRunnerC implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("FROM-C");
	}

}
