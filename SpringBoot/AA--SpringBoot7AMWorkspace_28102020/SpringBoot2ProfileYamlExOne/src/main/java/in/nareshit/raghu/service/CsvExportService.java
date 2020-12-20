package in.nareshit.raghu.service;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Profile("default")
@ConfigurationProperties(prefix = "my.app")
@Data
public class CsvExportService implements ExportService {

	private String driver;
	private String url;
	
	@Override
	public void export() {
		System.out.println("FROM CSV");
		System.out.println(this);
	}

}
