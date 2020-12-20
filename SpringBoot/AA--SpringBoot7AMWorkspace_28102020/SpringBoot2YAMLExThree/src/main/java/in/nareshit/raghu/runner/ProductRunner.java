package in.nareshit.raghu.runner;

import java.util.Map;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import in.nareshit.raghu.model.Vendor;
import lombok.Data;

@Component
@Data
@ConfigurationProperties(prefix = "my.app")
public class ProductRunner implements CommandLineRunner {
	
	private Integer pid;
	private String pcode;
	private Double pcost;
	
	//private List<String> details;
	//private Set<String> details;
	private String[] details;
	
	private Map<String,Integer> version;
	//private Properties version;
	
	private Vendor vob;

	@Override
	public void run(String... args) throws Exception {
		System.out.println(this);
	}

}
