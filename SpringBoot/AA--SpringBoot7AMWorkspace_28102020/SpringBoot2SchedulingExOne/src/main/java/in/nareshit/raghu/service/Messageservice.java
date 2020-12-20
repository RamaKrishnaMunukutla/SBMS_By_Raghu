package in.nareshit.raghu.service;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Messageservice {
	
	@Scheduled(fixedDelay = 5000) //1000 mill sec = 1sec
	public void printMsgA() {
		System.out.println("HELLO " + new Date());
	}
	
	@Scheduled(fixedDelay = 1000) //1000 mill sec = 1sec
	public void printMsgB() {
		System.out.println("HI " + new Date());
	}
}
