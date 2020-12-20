package in.nareshit.raghu.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.nareshit.raghu.model.Student;

@Component
public class TestLombok implements CommandLineRunner {

	public void run(String... args) throws Exception {
		Student s1 = new Student(); 
		Student s2 = new Student(101, "AA");
		System.out.println(s1);
		System.out.println(s2);
	}

}
