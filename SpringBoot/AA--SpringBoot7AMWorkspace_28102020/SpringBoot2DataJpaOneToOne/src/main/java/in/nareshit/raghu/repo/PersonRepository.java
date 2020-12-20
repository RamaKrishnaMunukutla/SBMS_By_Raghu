package in.nareshit.raghu.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.nareshit.raghu.model.Person;

public interface PersonRepository 
	extends JpaRepository<Person, Integer> {

}
