package in.nareshit.raghu.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.io.FileSystemResource;
import org.springframework.stereotype.Component;

import in.nareshit.raghu.util.EmailUtil;

@Component
public class TestEmailRunner implements CommandLineRunner {
	@Autowired
	private EmailUtil emailUtil;

	@Override
	public void run(String... args) throws Exception {
		FileSystemResource file = new FileSystemResource("F:\\Images\\SpringBoot7AM_25092020.png");

		boolean flag = emailUtil.send(
				"javaraghu2018@gmail.com", 
				new String[] {
						"dollygour612@gmail.com",
						"swaroopkumarbh@gmail.com", 
						"hemantpundir72@gmail.com",
				}, 
				new String[] {
						"santhugmcastar@gmail.com", 
						"gantyalau@gmail.com",
						"swaruphippergekar@gmail.com"
				}, 
				"SAMPLE DATA ONE", 
				"<html><body><h1>Hello Data ABC!</h1>"
				+"<img src='https://s3-ap-southeast-1.amazonaws.com/tv-prod/member/photo/745494-medium190ap.jpg'/> "
				+ "</body></html>", 
				file);
		if(flag) {
			System.out.println("SUCCESS");
		} else {
			System.out.println("FAIL");
		}

	}

}
