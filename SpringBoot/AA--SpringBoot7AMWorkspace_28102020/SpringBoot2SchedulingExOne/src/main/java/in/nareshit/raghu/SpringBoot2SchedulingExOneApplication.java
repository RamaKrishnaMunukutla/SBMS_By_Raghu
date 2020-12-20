package in.nareshit.raghu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

//ctrl+shift+O  (imports)
@SpringBootApplication
@EnableScheduling 
public class SpringBoot2SchedulingExOneApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot2SchedulingExOneApplication.class, args);
	}

}
