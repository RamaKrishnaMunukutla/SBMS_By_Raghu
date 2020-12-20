package in.nareshit.raghu.model;

//ctrl+shift+O
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="stdtab")
public class Student {
	@Id //-PK-> unique + not null
	@Column(name="sid")
	private Integer id;
	
	@Column(name="sname",length = 25,unique = true)
	private String sname;
	@Column(name="scourse",length = 30,nullable = false)
	private String course;
	@Column(name="sfee")
	private Double fee;
}
