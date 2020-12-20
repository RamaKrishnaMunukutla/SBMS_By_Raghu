package in.nareshit.raghu.runner;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyPropsRunner implements CommandLineRunner {

	//1 key data --> 1 variable
	// @Value("${key}")
	
	@Value("${app-id}")
	private int id;
	
	@Value("{title}")
	private String ttl;
	
	@Value("${version}")
	private double ver;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println(this);
		//System.out.println(id+"-"+ttl+"-"+ver);
	}

	@Override
	public String toString() {
		return "MyPropsRunner [id=" + id + ", ttl=" + ttl + ", ver=" + ver + "]";
	}
	
	

}
