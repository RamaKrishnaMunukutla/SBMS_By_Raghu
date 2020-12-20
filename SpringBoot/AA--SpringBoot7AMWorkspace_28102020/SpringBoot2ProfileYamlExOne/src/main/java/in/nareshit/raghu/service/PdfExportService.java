package in.nareshit.raghu.service;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Profile("prod")
@ConfigurationProperties(prefix = "my.app")
@Data
public class PdfExportService implements ExportService {

	private String driver;
	private String url;
	
	@Override
	public void export() {
		System.out.println("FROM PDF");
		System.out.println(this);
	}

}
