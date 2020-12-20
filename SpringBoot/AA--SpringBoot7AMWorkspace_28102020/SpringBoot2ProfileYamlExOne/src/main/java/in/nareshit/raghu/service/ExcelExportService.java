package in.nareshit.raghu.service;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component // creating object
@Profile("qa") // provide profile name
@ConfigurationProperties(prefix = "my.app") //read key:vals
@Data // set/get, toString, equals..
public class ExcelExportService implements ExportService {

	private String driver;
	private String url;
	
	@Override
	public void export() {
		System.out.println("FROM EXCEL");
		System.out.println(this);
	}

}
