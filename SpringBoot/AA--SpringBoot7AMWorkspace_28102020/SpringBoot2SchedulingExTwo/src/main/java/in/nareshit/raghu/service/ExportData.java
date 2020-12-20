package in.nareshit.raghu.service;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ExportData {

	@Scheduled(cron = "*/10 * * * * *") 
	public void execute() {
		System.out.println("DONE " + new Date());
	}
}
