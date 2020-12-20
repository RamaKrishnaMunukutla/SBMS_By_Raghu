package in.nareshit.raghu.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.nareshit.raghu.EmpExport;

@Configuration
public class AppConfig {

	@Bean
	public EmpExport eob() {
		EmpExport e = new EmpExport();
		e.setCode(550);
		e.setName("ABC");
		return e;
	}
}
