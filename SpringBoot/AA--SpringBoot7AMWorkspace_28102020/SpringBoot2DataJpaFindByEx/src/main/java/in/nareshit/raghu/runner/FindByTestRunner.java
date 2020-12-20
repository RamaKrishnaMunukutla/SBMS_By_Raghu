package in.nareshit.raghu.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.nareshit.raghu.repo.ProductRepository;
import in.nareshit.raghu.repo.ProductRepository.MyView;

@Component
public class FindByTestRunner implements CommandLineRunner {
	@Autowired
	private ProductRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
		//repo.findByProdVendor("NIM").forEach(System.out::println);
		//repo.findByProdGrade("A").forEach(System.out::println);
		//repo.findByProdCostGreaterThanEqual(3500.0).forEach(System.out::println);
		//repo.findByProdCostLessThan(3500.0).forEach(System.out::println);
		//repo.findByProdGradeIsNull().forEach(System.out::println);
		//repo.findByProdGradeNotNull().forEach(System.out::println);
		//repo.findByProdNameLike("S%").forEach(System.out::println);
		//repo.findByProdNameLike("%TV").forEach(System.out::println);
		//repo.findByProdNameLike("____").forEach(System.out::println); //exact 4 chars
		//repo.findByProdNameLike("_____%").forEach(System.out::println); // 5 chars or more 
		//repo.findByProdNameNotLike("S%").forEach(System.out::println);
		
		//it will add symbol % at the end 
		//repo.findByProdNameStartingWith("S").forEach(System.out::println);
		//it will add symbol % at the starting 
		//repo.findByProdNameEndingWith("TV").forEach(System.out::println);
		
		//repo.findByProdNameContaining("A").forEach(System.out::println);
		
		//repo.findByProdNameLikeAndProdCostGreaterThanEqual("%TV", 2000.0).forEach(System.out::println);
		//repo.findByProdNameLikeOrProdCostGreaterThanEqual("%TV", 2000.0).forEach(System.out::println);
		//repo.findByProdCostOrderByProdVendor(2500.0).forEach(System.out::println);
		//repo.findByProdCostOrderByProdVendorDesc(2500.0).forEach(System.out::println);
		
		List<MyView> list = repo.findByProdGrade("A");
		for(MyView m:list) {
			System.out.println(m.getProdName() +"-"+ m.getProdCost());
		}
		
		
		
		
	}

}
