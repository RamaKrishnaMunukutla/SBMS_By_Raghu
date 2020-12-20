package in.nareshit.raghu.runner;

import java.util.Map;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="my.app")
public class MyPropsMapRunner implements CommandLineRunner {

	private Map<String,Integer> edata;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println(this);
	}

	public Map<String, Integer> getEdata() {
		return edata;
	}

	public void setEdata(Map<String, Integer> edata) {
		this.edata = edata;
	}

	@Override
	public String toString() {
		return "MyPropsMapRunner [edata=" + edata + "]";
	}
	
}
