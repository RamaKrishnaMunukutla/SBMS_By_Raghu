package in.nareshit.raghu.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import in.nareshit.raghu.model.Employee;

public interface EmployeeRepository 
	extends JpaRepository<Employee, Integer> {

	@Query(value = "CALL GETALLEMPS()",nativeQuery = true)
	List<Employee> getAllEmps();
	
	@Query(value = "CALL GETEMPBYDEPT(?)",nativeQuery = true)
	List<Employee> getEmpsByDept(String edept);
	
	//?=call <procName>(?)
}
