package in.nareshit.raghu.rest;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
}
