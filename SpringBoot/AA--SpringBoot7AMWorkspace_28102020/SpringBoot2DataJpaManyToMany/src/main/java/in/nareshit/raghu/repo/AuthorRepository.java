package in.nareshit.raghu.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.nareshit.raghu.model.Author;

public interface AuthorRepository 
	extends JpaRepository<Author, Integer> {

}
