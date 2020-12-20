package in.nareshit.raghu.runner;

import java.util.Properties;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "my.app")
public class MyDataReader implements CommandLineRunner {

	private Properties pdata;
	
	public void run(String... args) throws Exception {
		System.out.println(pdata);
	}

	public Properties getPdata() {
		return pdata;
	}

	public void setPdata(Properties pdata) {
		this.pdata = pdata;
	}

}
