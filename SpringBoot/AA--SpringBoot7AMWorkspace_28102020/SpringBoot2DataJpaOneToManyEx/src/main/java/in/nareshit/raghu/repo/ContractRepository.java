package in.nareshit.raghu.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.nareshit.raghu.model.Contract;

public interface ContractRepository 
	extends JpaRepository<Contract, Integer> {

}
