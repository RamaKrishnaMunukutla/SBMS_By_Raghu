package in.nareshit.raghu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan("in.nareshit")
@ComponentScan({"in.nareshit","com.app"})
public class SpringBoot2ClrExThreeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot2ClrExThreeApplication.class, args);
	}

}
