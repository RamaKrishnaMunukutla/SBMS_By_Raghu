package in.nareshit.raghu.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import in.nareshit.raghu.model.Book;

public interface BookRepository 
	extends JpaRepository<Book, Integer> {

}
