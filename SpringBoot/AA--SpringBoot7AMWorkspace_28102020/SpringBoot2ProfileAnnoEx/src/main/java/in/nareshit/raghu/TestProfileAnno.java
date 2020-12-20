package in.nareshit.raghu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.nareshit.raghu.service.AlertSystem;

@Component
public class TestProfileAnno implements CommandLineRunner {
	@Autowired
	private AlertSystem als;
	
	@Override
	public void run(String... args) throws Exception {
		als.sendMessage();
	}

}
