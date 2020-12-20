package in.nareshit.raghu.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;


@Component
@Data
@ConfigurationProperties(prefix = "app")
public class DataReaderRunner implements CommandLineRunner {

	//@Value("${app.db}")
	private String db;
	//@Value("${app.pwd}")
	private String pwd;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println(this);
	}

}
