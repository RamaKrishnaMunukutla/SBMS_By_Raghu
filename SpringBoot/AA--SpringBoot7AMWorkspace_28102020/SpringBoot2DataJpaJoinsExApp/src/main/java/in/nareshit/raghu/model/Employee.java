package in.nareshit.raghu.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Employee {
	@Id
	private Integer eid;
	private String ename;
	private Double esal;
	private String addr;
	@OneToMany
	@JoinColumn(name="eidFk")
	private List<Project> prjs;
	
}
