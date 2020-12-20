package in.nareshit.raghu.runner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import in.nareshit.raghu.model.Product;
import in.nareshit.raghu.repo.ProductRepository;

//@Component
public class DataInsertRunner implements CommandLineRunner {
	@Autowired
	private ProductRepository repo;

	@Override
	public void run(String... args) throws Exception {
		repo.saveAll(
				Arrays.asList(
						new Product(101, "S-TV", 2500.0, "DELL", "A"),
						new Product(102, "S-LAP", 3500.0, "DELL", "B"),
						new Product(103, "M-TV", 2800.0, "NIM", "A"),
						new Product(104, "M-LAP", 4500.0, "NIM", "C"),
						new Product(105, "R-INVRT", 1500.0, "RIT", "A"),
						new Product(106, "M-KEBRD", 9500.0, "NIM", "B"),
						new Product(107, "R-TV", 5500.0, "RIT", "C")
						)
				);
	}

}
