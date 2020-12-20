package in.nareshit.raghu.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.nareshit.raghu.service.ExportService;

@Component
public class DataReadRunner implements CommandLineRunner {
	@Autowired
	private ExportService service;
	
	@Override
	public void run(String... args) throws Exception {
		service.export();
	}

}
