package in.nareshit.raghu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBoot2JavaConfigExOneApplication {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(SpringBoot2JavaConfigExOneApplication.class, args);
		EmpExport e = ac.getBean("eob",EmpExport.class);
		System.out.println(e);
	}

}
