package in.nareshit.raghu.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Component;

import in.nareshit.raghu.model.Student;
import in.nareshit.raghu.repo.StudentRepository;

@Component
public class StudentRunner implements CommandLineRunner {
	@Autowired
	private StudentRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
		/*
		repo.save(new Student(10, "AAN", "CORE", 300.0));
		repo.save(new Student(11, "CBY", "BOOT", 600.0));
		repo.save(new Student(12, "COD", "MS", 800.0));
		repo.save(new Student(13, "TDR", "ADV", 400.0));
		repo.save(new Student(14, "HMN", "SQL", 300.0));
		repo.save(new Student(15, "EFT", "UI", 200.0));
		repo.save(new Student(16, "IJK", "BOOT", 400.0));
		repo.save(new Student(17, "MNO", "ADV", 800.0));
		repo.save(new Student(18, "PQR", "SQL", 300.0));
		repo.save(new Student(19, "STV", "UI", 200.0));
		repo.save(new Student(20, "WXY", "MS", 800.0));
		*/
		
		// Prepare Pagination Input (number,size,sort)
		Pageable input = PageRequest.of(0, 3,Sort.by(Direction.DESC,"sname"));
		
		Page<Student> page = repo.findAll(input);
		
		List<Student> list =  page.getContent();
		list.forEach(System.out::println);

		//-------additional info---
		System.out.println("Is Data exist in Page? " + page.hasContent());
		System.out.println( "Is First Page? " +page.isFirst());
		System.out.println("Is Last Page? " +page.isLast());
		System.out.println("Is Empty Page? " +page.isEmpty());
		System.out.println("has Next Page? " +page.hasNext());
		System.out.println("Has Previous Page? " +page.hasPrevious());
		System.out.println("Current Page Number " +page.getNumber());
		System.out.println("Total Pages " +page.getTotalPages());
		System.out.println("Total Rows  " +page.getTotalElements());
	}

}
