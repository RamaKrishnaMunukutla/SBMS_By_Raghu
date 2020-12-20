package in.nareshit.raghu.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import in.nareshit.raghu.model.DbConn;

@Component
@ConfigurationProperties(prefix = "my.app")
public class MyDataRunner implements CommandLineRunner {

	private DbConn con;
	
	public void run(String... args) throws Exception {
		System.out.println(con);
	}

	public DbConn getCon() {
		return con;
	}

	public void setCon(DbConn con) {
		this.con = con;
	}
	

}
