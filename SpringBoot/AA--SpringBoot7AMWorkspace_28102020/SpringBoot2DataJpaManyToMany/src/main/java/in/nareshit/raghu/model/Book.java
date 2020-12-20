package in.nareshit.raghu.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Book {
	@Id
	private Integer bid;
	private String bname;
	private String btype;
	
	
	@ManyToMany
	@JoinTable(
			name="book_auth_tab",
			joinColumns = @JoinColumn(name="bid_fk"),
			inverseJoinColumns = @JoinColumn(name="aid_fk")
			)
	private List<Author> aobs;
	
}
