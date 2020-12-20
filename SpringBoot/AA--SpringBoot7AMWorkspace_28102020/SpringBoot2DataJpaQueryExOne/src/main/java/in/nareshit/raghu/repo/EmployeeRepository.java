package in.nareshit.raghu.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import in.nareshit.raghu.model.Employee;

public interface EmployeeRepository
extends JpaRepository<Employee, Integer> {

	//Writing package name for Model class is optional
	@Query("SELECT e FROM in.nareshit.raghu.model.Employee e")
	//@Query("SELECT e FROM Employee e")
	List<Employee> getAllEmps();

	// Positional Parameter ?1 takes input while calling method
	// from method parameter in order
	//@Query("SELECT e FROM Employee e WHERE dept=?1")  //positional param
	@Query("SELECT e FROM Employee e WHERE dept=:dept") // named param
	List<Employee> getAllEmpsByDept(String dept);

	//@Query("SELECT e FROM Employee e WHERE dept=?2 or id=?1")
	@Query("SELECT e FROM Employee e WHERE dept=?1 or id>?2")
	List<Employee> getAllEmpsByInfo(String dept, Integer id);

	// Fetch data from range
	@Query("SELECT e FROM Employee e WHERE id between ?1 and ?2")
	List<Employee> getAllEmpsByInfo2(Integer id1,Integer id2);
	
	// Named Parameter (:anyName--> must match with method parameter)
	@Query("SELECT e FROM Employee e WHERE id between :id1 and :id2")
	List<Employee> getAllEmpsByInfo3(Integer id2, Integer id1); //no order required
	//List<Employee> getAllEmpsByInfo3(Integer id1,Integer id2);

	//in operator to fetch data in selected order
	@Query("SELECT e FROM Employee e WHERE id in (:inputs)")
	List<Employee> getAllEmpsById(List<Integer> inputs);
	
	
	//------------SQL Query----------------------------------
	@Query(nativeQuery = true,value = "SELECT * FROM EMPLOYEE")
	List<Employee> fetchDatabySql();
		
}
