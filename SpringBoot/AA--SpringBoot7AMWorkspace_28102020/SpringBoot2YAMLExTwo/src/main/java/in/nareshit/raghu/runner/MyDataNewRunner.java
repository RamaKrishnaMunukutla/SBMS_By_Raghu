package in.nareshit.raghu.runner;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class MyDataNewRunner implements CommandLineRunner {
	@Value("${my.app.id}")
	private Integer id;
	@Value("${my.app.code}")
	private String code;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println(this);
	}

}
