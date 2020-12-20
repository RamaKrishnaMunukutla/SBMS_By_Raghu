package org.sathyatech.raghu.runner;

import org.sathyatech.raghu.service.MailServiceProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ConsoleRunner implements CommandLineRunner {
	@Autowired
	private MailServiceProvider mail;

	public ConsoleRunner() {}

	public void run(String... args) throws Exception
	{
		String text = " <html><body> "
				+ " <h2> FROM RAGHU SIR </h2> "
				+ " <img src='cid:doc50'/> <br/>  "
				+ " <h3> \"WELCOME TO ALL STUDENTS\"</h3> "
				+ " <b> All the best </b>"
				+ "</body></html>";


		boolean isSent = mail.sendMail("Hello", text, "javabyraghu@gmail.com", "EclipseShortcutsByRaghuSir.pdf", "logo.png");
		System.out.println(isSent ? "YES" : "NO");
	}
}