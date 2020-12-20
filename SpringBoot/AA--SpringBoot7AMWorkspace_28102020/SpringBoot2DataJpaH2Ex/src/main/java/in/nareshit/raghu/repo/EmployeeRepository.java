package in.nareshit.raghu.repo;

import org.springframework.data.repository.CrudRepository;

import in.nareshit.raghu.model.Employee;

public interface EmployeeRepository 
	extends CrudRepository<Employee, Integer> {

}
