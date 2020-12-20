package in.nareshit.raghu.model;

import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapKeyColumn;
import javax.persistence.OrderColumn;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="emptab")
public class Employee {
	@Id
	@Column(name="eid")
	private Integer empId;
	@Column(name="ename")
	private String empName;
	@Column(name="esal")
	private Double empSal;
	
	@ElementCollection
	@CollectionTable(name="empprjstab",
	joinColumns = @JoinColumn(name="eid")) //key column
	@Column(name="prj") //element column
	@OrderColumn(name="pos") //index column
	private List<String> empPrjs;
	
	
	@ElementCollection
	//@CollectionTable(name="emptasktab",joinColumns = @JoinColumn(name="eid"))//key column
	@Column(name="task") // element column
	private Set<String> empTaks;

	
	@ElementCollection
	@CollectionTable(name="empmodulestab",
	joinColumns = @JoinColumn(name="eid")) //key column
	@Column(name="module") //element column
	@MapKeyColumn(name="pos") // index column
	private Map<Integer,String> empModules;
	
	
}
