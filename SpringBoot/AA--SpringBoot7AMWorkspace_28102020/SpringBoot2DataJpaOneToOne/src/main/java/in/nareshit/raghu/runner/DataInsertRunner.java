package in.nareshit.raghu.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.nareshit.raghu.model.Person;
import in.nareshit.raghu.model.Profile;
import in.nareshit.raghu.repo.PersonRepository;
import in.nareshit.raghu.repo.ProfileRepository;

@Component
public class DataInsertRunner implements CommandLineRunner {
	@Autowired
	private ProfileRepository prRepo;
	
	@Autowired
	private PersonRepository peRepo;
	
	@Override
	public void run(String... args) throws Exception {

		Profile p1 = new Profile(50, "P1", "PANCARD", "AABB55001", "HYD");
		Profile p2 = new Profile(51, "P2", "DL", "LOB85651", "CHN");
		Profile p3 = new Profile(52, "P3", "AADHAR", "PIBB2419", "BAN");
	
		prRepo.save(p1);
		prRepo.save(p2);
		prRepo.save(p3);
		
		Person pe1 =  new Person(1501, "S", "A", "550-65847", "MALE", p1);
		Person pe2 =  new Person(1502, "H", "B", "96-0065847", "MALE", p2);
		Person pe3 =  new Person(1503, "K", "C", "770-5665847", "FEMALE", p3);
		
		peRepo.save(pe1);
		peRepo.save(pe2);
		peRepo.save(pe3);
	}

}
