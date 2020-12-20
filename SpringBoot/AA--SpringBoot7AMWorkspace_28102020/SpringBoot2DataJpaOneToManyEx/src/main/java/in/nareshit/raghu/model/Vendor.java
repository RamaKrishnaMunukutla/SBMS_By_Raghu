package in.nareshit.raghu.model;

import java.util.List;

import javax.persistence.CascadeType;
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
public class Vendor {
	@Id
	private Integer vid;
	private String vname;
	private String vaddr;
	
	/**
	 *       1...*
	 * Vendor ---<> Contract
	 *        HAS-A
	 */
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="vid_fk")
	private List<Contract> cobs; //HAS-A
	
}
