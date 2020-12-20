package in.nareshit.raghu.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import in.nareshit.raghu.model.Employee;

public interface EmployeeRepository 
	extends JpaRepository<Employee, Integer> {

	//---------------Multiple rows output-------------------//

	@Query("SELECT e FROM Employee e")
	List<Employee> getAllEmployees();
	
	@Query("SELECT e.empName FROM Employee e")
	List<String> getAllEmployeeNames();
	
	@Query("SELECT e.empName,e.empSal FROM Employee e")
	List<Object[]> getAllEmployeeNameAndSal();
	
	//---------------One row output----------------//
	
	@Query("SELECT e FROM Employee e WHERE e.empId=:empId")
	Employee getEmployeeById(Integer empId);
	
	@Query("SELECT e.empName,e.empSal FROM Employee e WHERE e.empId=:empId")
	Object getEmployeeNameAndSalById(Integer empId);
	
	@Query("SELECT e.empName FROM Employee e WHERE e.empId=:empId")
	String getEmployeeNameById(Integer empId);
	
	//------------Problem case------------//
	@Query("SELECT e.empName FROM Employee e WHERE e.empDept=:empDept")
	//List<String> getEmployeeNameByDept(String empDept);
	//NonUniqueResultException: query did not return a unique result: 2
	String getEmployeeNameByDept(String empDept);
	
}
