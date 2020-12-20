package in.nareshit.raghu.model;

//JPA
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;

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
	@Lob // BLOB
	private byte[] eimg;
	@Lob // CLOB
	private char[] edesc;
	
	private String imgLoc;
}
