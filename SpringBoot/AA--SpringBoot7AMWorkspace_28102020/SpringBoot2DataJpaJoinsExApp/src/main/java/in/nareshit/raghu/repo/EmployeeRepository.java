package in.nareshit.raghu.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import in.nareshit.raghu.model.Employee;

public interface EmployeeRepository 
	extends JpaRepository<Employee, Integer> {

	@Query("SELECT e.ename,e.addr,p.pcode FROM Employee e INNER JOIN e.prjs  AS  p WHERE p.client=:client")
	List<Object[]> getDataByClient(String client);
	
	
	@Query("SELECT e.ename,e.addr,p.pcode FROM Employee e RIGHT JOIN e.prjs  AS  p WHERE p.client=:client")
	List<Object[]> getDataByClientRJ(String client);
	
	@Query("SELECT e.ename,e.addr,p.pcode FROM Employee e LEFT OUTER JOIN e.prjs  AS  p WHERE e.addr=:addr")
	//@Query("SELECT e.ename,e.addr,p.pcode FROM Employee e JOIN e.prjs  AS  p WHERE e.addr=:addr")
	//@Query("SELECT e.ename,e.addr,p.pcode FROM Employee e FULL JOIN e.prjs  AS  p WHERE e.addr=:addr")
	List<Object[]> getDataByClientLJ(String addr);
}
