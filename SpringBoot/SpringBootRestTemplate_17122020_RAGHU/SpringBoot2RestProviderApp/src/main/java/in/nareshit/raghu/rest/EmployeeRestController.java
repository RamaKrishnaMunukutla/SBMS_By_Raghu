package in.nareshit.raghu.rest;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.nareshit.raghu.model.Employee;

@RestController
@RequestMapping("/employee")
public class EmployeeRestController {

	@GetMapping("/show")
	public ResponseEntity<String> getMessage() {
		return ResponseEntity.ok("HI");
	}

	@GetMapping("/one/{id}")
	public ResponseEntity<Employee> getOneEmp(
			@PathVariable Integer id
			)
	{
		return ResponseEntity.ok(new Employee(id,"A",3.3));
	}

	@GetMapping("/all")
	public ResponseEntity<List<Employee>> getAllEmp()
	{
		return ResponseEntity.ok(
				Arrays.asList(
						new Employee(10,"A",3.3),
						new Employee(11,"B",4.3),
						new Employee(12,"C",5.3)
						)
				);
	}
	
	@PostMapping("/save")
	public ResponseEntity<String> saveEmployee(
			@RequestBody Employee employee
			) 
	{
		
		return ResponseEntity.ok("Employee saved" +employee);
	}
	
	@DeleteMapping("/remove/{id}/{name}")
	public ResponseEntity<String> deleteEmployee(
			@PathVariable Integer id,
			@PathVariable String name
			) 
	{
		return ResponseEntity.ok("Employee Deleted => " +id +","+name);
	}
	
	@PutMapping("/modify/{id}")
	public ResponseEntity<String> modifyEmployee(
			@PathVariable Integer id,
			@RequestBody Employee employee
			)
	{
		return ResponseEntity.ok("Employee Updated => " +id +","+employee);
	}
	
	@PatchMapping("/update/{id}/{name}")
	public ResponseEntity<String> updateEmpName(
			@PathVariable Integer id,
			@PathVariable String name
			) 
	{
		return ResponseEntity.ok("Employee name Updated => " +id +","+name);
	}
	
	
}
