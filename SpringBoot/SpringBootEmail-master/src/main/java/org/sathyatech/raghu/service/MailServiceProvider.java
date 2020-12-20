package org.sathyatech.raghu.service;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ClassPathResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

@Service
public class MailServiceProvider
{
	@Value("${spring.mail.username}")
	private String from;
	@Autowired
	private JavaMailSender sender;

	public MailServiceProvider() {}

	public boolean sendMail(String subject, String text, String to, String localfile, String logo)
	{
		boolean isMailsent = false;
		MimeMessage message = sender.createMimeMessage();
		MimeMessageHelper helper = null;
		try {
			helper = new MimeMessageHelper(message, true);
			helper.setTo(to);
			helper.setSubject(subject);
			helper.setText(text, true);
			helper.addAttachment("eclipse.pdf", new ClassPathResource(localfile));
			helper.addInline("doc50", new ClassPathResource(logo));
			helper.setFrom(from);

			sender.send(message);
			isMailsent = true;
		} catch (MessagingException e) {
			e.printStackTrace();
			isMailsent = false;
		}
		return isMailsent;
	}
}