package in.nareshit.raghu.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.nareshit.raghu.model.Vendor;

public interface VendorRepository 
	extends JpaRepository<Vendor, Integer> {

}
