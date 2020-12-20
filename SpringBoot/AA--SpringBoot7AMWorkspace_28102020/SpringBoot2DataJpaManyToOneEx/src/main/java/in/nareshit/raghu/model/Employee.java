package in.nareshit.raghu.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Employee {
	@Id
	private Integer id;
	private String name;
	private Double sal;
	
	//       *...1
	//Employee---<> Dept
	@ManyToOne
	@JoinColumn(name="didFk")
	private Dept dob;
	
}
