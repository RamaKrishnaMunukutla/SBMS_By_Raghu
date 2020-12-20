package com.app.test;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MessageARunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("SAMPLE-A");
	}

}
