package in.nareshit.raghu.runner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.nareshit.raghu.model.Author;
import in.nareshit.raghu.model.Book;
import in.nareshit.raghu.repo.AuthorRepository;
import in.nareshit.raghu.repo.BookRepository;

@Component
public class DataInsertRunner implements CommandLineRunner {
	@Autowired
	private AuthorRepository arepo;
	
	@Autowired
	private BookRepository brepo;
	
	@Override
	public void run(String... args) throws Exception {
		Author a1 = new Author(60, "SAM", "HYD"); 
		Author a2 = new Author(61, "SYED", "CHN"); 
		Author a3 = new Author(62, "RAM", "HYD"); 
		Author a4 = new Author(63, "KHAN", "DHL"); 
		
		arepo.save(a1);
		arepo.save(a2);
		arepo.save(a3);
		arepo.save(a4);
				
		Book b1 = new Book(98001, "CORE JAVA", "PRGM", Arrays.asList(a2,a3));
		Book b2 = new Book(98002, "DP", "THERY", Arrays.asList(a1,a2));
		Book b3 = new Book(98003, "CODE TYPE", "MATHS", Arrays.asList(a3,a4));

		brepo.save(b1);
		brepo.save(b2);
		brepo.save(b3);
		
	}

}
