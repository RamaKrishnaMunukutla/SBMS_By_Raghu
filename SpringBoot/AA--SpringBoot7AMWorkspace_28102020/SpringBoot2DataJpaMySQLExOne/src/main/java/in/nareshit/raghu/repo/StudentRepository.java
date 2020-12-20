package in.nareshit.raghu.repo;

import org.springframework.data.repository.PagingAndSortingRepository;

import in.nareshit.raghu.model.Student;

public interface StudentRepository 
	extends PagingAndSortingRepository<Student, Integer>{

}
