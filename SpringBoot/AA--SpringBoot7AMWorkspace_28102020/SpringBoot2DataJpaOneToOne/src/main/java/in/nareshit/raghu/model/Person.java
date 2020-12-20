package in.nareshit.raghu.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Person {
	@Id
	private Integer id;
	private String fname;
	private String lname;
	private String contact;
	private String gender;
	
	
	
	@ManyToOne
	@JoinColumn(name="pr_id_fk",unique = true)
	private Profile prob; //HAS-A
		
}
