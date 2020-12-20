package in.nareshit.raghu.service.impl;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import in.nareshit.raghu.service.AlertSystem;
import lombok.Data;

@Component
@Profile("email")
@ConfigurationProperties(prefix = "my.app")
@Data
public class EmailAlertSystem implements AlertSystem {

	private String service;
	private String fmt;
	
	@Override
	public void sendMessage() {
		System.out.println("FROM EMAIL SYSTEM-" + service +"-" +fmt);
	}

}
