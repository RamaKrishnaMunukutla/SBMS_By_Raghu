package in.nareshit.raghu.runner;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

//ctrl+shift+O(imports)
@Component
public class MyDataReader implements CommandLineRunner {
	@Value("${code}")
	private String code;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("DONE :" + code);
	}
}
